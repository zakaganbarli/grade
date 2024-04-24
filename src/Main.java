import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculation();
    }

    public static void showOperation() {
        System.out.println("1. add\n2. Subtract\n3. Multiply\n4. Divide");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void calculation() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        while (true) {
            showOperation();
            System.out.print("Enter an operation: ");
            int operation = scanner.nextInt();

            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();
            System.out.print("Enter second number: ");
            int secondNum = scanner.nextInt();
            int result = 0;
            switch (operation) {
                case 1:
                    result = add(firstNum, secondNum);
                    break;
                case 2:
                    result = subtract(firstNum, secondNum);
                    break;
                case 3:
                    result = multiply(firstNum, secondNum);
                    break;
                case 4:
                    if (secondNum != 0) {
                        result = divide(firstNum, secondNum);
                        break;
                    }
                    System.out.print("Second number cannot be zero: ");
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println("Result: " + result);

            do {
                System.out.print("If you want to continue, press 'y', otherwise press 'n': ");
                answer = scanner.next();
            } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

            if (answer.equalsIgnoreCase("n"))
                break;
        }
    }
}

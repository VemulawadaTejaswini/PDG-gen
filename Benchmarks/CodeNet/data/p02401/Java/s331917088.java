import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOOP: while(true) {
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            int result;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    break LOOP;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}


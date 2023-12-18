import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();

            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
                System.out.println(a / b);
            } else if (op.equals("?")) {
                break;
            }

        }

    }

}
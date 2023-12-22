import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int answer = 0;

            if (op.equals("+")) {
                answer = a + b;
            } else if (op.equals("-")) {
                answer = a - b;
            } else if (op.equals("/")) {
                answer = a / b;
            } else if (op.equals("*")) {
                answer = a * b;
            } else {
                break;
            }

            System.out.println(answer);

        }
    }

}


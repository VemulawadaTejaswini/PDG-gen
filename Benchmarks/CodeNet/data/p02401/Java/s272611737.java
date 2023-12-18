import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;

        while (true) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();

            if (op.equals("?")) {
                break;
            }

            if (op.equals("+")) {
                answer = a + b;
            } else if (op.equals("-")) {
                answer = a - b;;
            } else if (op.equals("*")) {
                answer = a * b;
            } else if (op.equals("/")) {
                answer = a / b;
            }
            System.out.println(answer);
        }
    }
}
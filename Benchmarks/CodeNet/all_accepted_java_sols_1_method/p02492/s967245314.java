import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a     = scan.nextInt();
            String op = scan.next();
            int b     = scan.nextInt();

            int n = 0;
            if (op.equals("?")) break;
            else if (op.equals("+")) n = a + b;
            else if (op.equals("-")) n = a - b;
            else if (op.equals("*")) n = a * b;
            else if (op.equals("/")) n = a / b;
            System.out.println(n);
        }
    }
}
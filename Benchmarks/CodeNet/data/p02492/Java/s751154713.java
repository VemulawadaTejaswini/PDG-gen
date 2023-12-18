import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, ans;
        String op;

        while (true) {
            a = scan.nextInt();
            op = scan.next();
            b = scan.nextInt();

            if (op.equals("+")) {
                ans = a + b;
            } else if (op.equals("-")) {
                ans = a - b;
            } else if (op.equals("*")) {
                ans = a * b;
            } else {
                ans = a / b;
            }

            System.out.println(ans);
        }
    }
}
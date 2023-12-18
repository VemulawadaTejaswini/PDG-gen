import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (true) {
            int a = in.nextInt();
            String op = in.next();
            int b = in.nextInt();
            final int ans;
            if (op.equals("+")) {
                ans = a + b;
            } else if (op.equals("-")) {
                ans = a - b;
            } else if (op.equals("*")) {
                ans = a * b;
            } else if (op.equals("/")) {
                ans = a / b;
            } else {
                break;
            }
            System.out.println(ans);
        }
    }
}
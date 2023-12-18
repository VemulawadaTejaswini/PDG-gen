import java.util.Scanner;
import java.util.Stack;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            Stack<Double> stack = new Stack<Double>();
            for (String string: input) {
                final char c = string.charAt(0);
                if (Character.isDigit(c)) {
                    stack.push(Double.valueOf(string));
                } else {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    if (c == '+') {
                        stack.push(op1 + op2);
                    } else if (c == '-') {
                        stack.push(op1 - op2);
                    } else if (c == '*') {
                        stack.push(op1 * op2);
                    } else if (c == '/') {
                        stack.push(op1 / op2);
                    }
                }
            }
            System.out.println(String.format("%.6f", stack.pop()));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
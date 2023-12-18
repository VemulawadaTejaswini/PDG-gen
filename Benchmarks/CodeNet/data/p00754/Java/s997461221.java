import java.util.Scanner;

class Main {
    private static char[] input;
    private static int ptr;
    private static boolean isBalancedRec() {
        while (true) {
            if (Character.isLetter(input[ptr]) || input[ptr] == ' ') {
                ptr++;
            } else if (input[ptr] == '(' || input[ptr] == '[') {
                final char right = input[ptr] == '(' ? ')' : ']';
                ptr++;
                if (isBalancedRec() && input[ptr] == right) {
                    ptr++;
                } else {
                    return false;
                }
            } else if (input[ptr] == ')' || input[ptr] == ']' || input[ptr] == '.') {
                break;
            }
        }
        return true;
    }

    private static boolean isBalanced(String input) {
        Main.input = input.toCharArray();
        Main.ptr = 0;
        return isBalancedRec() && Main.input[Main.ptr] == '.';
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            String string = scanner.next();
            if (string.equals(".")) {
                break;
            }
            System.out.println(isBalanced(string) ? "yes" : "no");
        }
    }

    public static void main(String... args) {
        solve();
    }
}
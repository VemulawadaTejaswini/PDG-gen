import java.util.Scanner;

class Main {
    private static char[] expr;
    private static int ptr;

    private static boolean expression() {
        do {
            assert expr[ptr] == '(';
            ptr++;
            if (clause()) {
                assert expr[ptr] == ')';
                return true;
            } else {
                assert expr[ptr] == ')';
                ptr++;
            }
        } while (ptr < expr.length && expr[ptr++] == '|');
        assert ptr == expr.length;
        return false;
    }

    private static boolean clause() {
        int[] assigments = new int['z' + 1];
        do {
            if (!literal(assigments)) {
                return false;
            }
        } while (expr[ptr++] == '&');
        ptr--;
        return true;
    }

    private static boolean literal(int[] assigments) {
        int x;
        if (expr[ptr] == '~') {
            ptr++;
            x = 1;
        } else {
            x = -1;
        }
        if (assigments[expr[ptr]] == x) {
            ptr++;
            return false;
        } else {
            assigments[expr[ptr]] = -1 * x;
            ptr++;
            return true;
        }
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if (input.equals("#")) {
                break;
            }
            Main.ptr = 0;
            Main.expr = input.toCharArray();
            System.out.println(expression() ? "yes" : "no");
        }
    }

    public static void main(String... args) {
        solve();
    }
}
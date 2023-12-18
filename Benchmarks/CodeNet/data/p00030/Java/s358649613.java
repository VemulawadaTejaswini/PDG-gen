import java.util.Scanner;

class Main {
    private static int rec(int i, int n, int s) {
        if (n == 0) {
            return s == 0 ? 1 : 0;
        } else if (i > 9) {
            return 0;
        } else {
            return rec(i + 1, n, s) + rec(i + 1, n - 1, s - i);
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            if (n == 0 && s == 0) {
                break;
            }
            System.out.println(rec(0, n, s));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
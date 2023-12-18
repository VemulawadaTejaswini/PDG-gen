import java.util.Scanner;

class Main {
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int p = scanner.nextInt();
            int n = scanner.nextInt();
            if (p == 0 && n == 0) {
                break;
            }
            int u = 1;
            int v = n;
            int x = n;
            int y = 1;

            for (int i = 1; i <= n; i++) {
                int num = (int) (i * Math.sqrt(p));
                int den = i;
                if (num > n) {
                    break;
                }
                if ((double) num / den > (double) u / v && gcd(num, den) == 1) {
                    u = num;
                    v = den;
                }
                num++;
                if (num > n) {
                    continue;
                }
                if ((double) num / den < (double) x / y && gcd(num, den) == 1) {
                    x = num;
                    y = den;
                }
            }
            System.out.println(String.format("%d/%d %d/%d", x, y, u, v));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
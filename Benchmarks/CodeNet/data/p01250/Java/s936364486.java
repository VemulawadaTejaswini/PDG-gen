import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final double r = scanner.nextDouble();
            if (r == 0.0) {
                break;
            }
            for (int den = 1; ; den++) {
                final double num = Math.round(Math.PI * den);
                if (Math.abs(Math.PI - num / den) < r) {
                    System.out.println((int) num + "/" + den);
                    break;
                }
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}
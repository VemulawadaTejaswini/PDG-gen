import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int q = scanner.nextInt();
            if (q == -1) {
                break;
            }
            double x = q / 2;
            while (Math.abs(x * x * x - q) >= 0.000001 * q) {
                x = x - (x * x * x - q) / (3 * x * x);
            }
            System.out.println(String.format("%f", x));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            int f = scanner.nextInt();
            double x = 0;
            double y = 0;
            if (c * e - b * f != 0) {
                x = (double) (c * e - b * f) / (a * e - b * d);
            }
            if (c * d - a * f != 0) {
                y = (double) (c * d - a * f) / (b * d - a * e);
            }
            System.out.println(String.format("%.3f %.3f", x, y));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
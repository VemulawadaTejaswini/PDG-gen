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
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(gcd(a, b));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
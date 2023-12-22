import java.util.Scanner;

class Main {
    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    private static long lcm(long a, long b) {
        long gcd = gcd(a, b);
        return a * b / gcd;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(gcd(a, b) + " " + lcm(a, b));
        }
    }

    public static void main(String... args) {
        solve();
    }
}
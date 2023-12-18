import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(gcd(a, b) + " " + lcm(a, b));
        }
    }

    static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}

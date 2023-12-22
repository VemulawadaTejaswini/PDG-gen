import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() - 1;
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long lcm = lcm(c, d);
        long e = b - a;
        long f = a / c;
        long g = a / d;
        long h = a / lcm;
        long ans1 = a - f - g + h;
        long i = b / c;
        long j = b / d;
        long k = b / lcm;
        long ans2 = b - i - j + k;
        long ans = ans2 - ans1;
        System.out.println(ans);
    }

    public static final long lcm(final long a, final long b) {
        return a * b / gcd(a, b);
    }

    public static final long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
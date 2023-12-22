import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();

        // e: cとdの最大公約数
        long e = gcd2(c, d);
        // f: cとdの最小公倍数
        long f = (c / e) * (d / e) * e;

        // x: cで割り切れる数の個数
        long x = num(a, b, c);
        // y: dで割り切れる数の個数
        long y = num(a, b, d);
        // z: eで割り切れる数の個数
        long z = num(a, b, f);

        // 答え
        long ans = (b - a + 1) - (x + y - z);
        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(b, a - b);
        } else {
            return gcd(a, b - a);
        }
    }

    // a > b
    static long gcd2(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return gcd2(b, a % b);
    }

    // a: 下限
    // b: 上限
    // c: 割る数
    static long num(long a, long b, long c) {
        long x = (b - a + 1) / c;
        if (((b - a + 1) % c) > (c - (a % c))) {
            x++;
        }
        return x;
    }
}

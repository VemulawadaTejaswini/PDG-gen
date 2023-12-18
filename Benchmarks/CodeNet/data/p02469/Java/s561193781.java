import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        scanner.nextLine();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Gcd gcd = new Gcd();
        long lcm = n[0] * n[1] / gcd.gcd(n[0], n[1]);
        for (int i = 2; i < n.length; i++) {
            lcm = lcm * n[i] / gcd.gcd(lcm, n[i]);
        }
        System.out.println(lcm);
    }

}

class Gcd {
    class GcdResult {
        // xa + yb = n;
        final long a;
        final long b;
        final long gcd;

        public GcdResult(long a, long b, long gcd) {
            this.a = a;
            this.b = b;
            this.gcd = gcd;
        }
    }

    public GcdResult extGcd(long x, long y) {
        if (x < y) {
            return extGcd(y, x);
        }
        if (y == 0) {
            return new GcdResult(1, 0, x);
        }
        GcdResult res = extGcd(y, x % y);
        long a = res.b;
        long b = res.a - (x / y) * res.b;
        return new GcdResult(a, b, res.gcd);
    }

    public long gcd(long x, long y) {
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}



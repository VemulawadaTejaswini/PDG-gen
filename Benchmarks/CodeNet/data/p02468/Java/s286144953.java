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
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(new Power().pow(M, N));
    }

}

class Power {
    private long MOD = 1_000_000_007;

    public long pow(long x, long n) {
        return pow(x, n, MOD);
    }

    public long pow(long x, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return res;
    }
}


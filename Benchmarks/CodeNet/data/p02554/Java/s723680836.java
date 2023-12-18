import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = 0;
        final int MOD = 1_000_000_007;
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
        }
        long p = modPow(10, n, MOD) - 2 * modPow(9, n, MOD) + modPow(8, n, MOD);
        p %= MOD;
        System.out.println(p >= 0 ? p : p + MOD);
    }
    
    private static long modPow(int base, int pow, int mod) {
        long a = base;
        long result = 1;
        for (int i = 1; i <= pow; i <<= 1) {
            if ((pow & i) != 0) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
        }
        return result;
    }
}

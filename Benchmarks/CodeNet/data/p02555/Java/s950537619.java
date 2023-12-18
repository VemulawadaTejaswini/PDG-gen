import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = new Scanner(System.in).nextInt();
        System.out.println(solve(N));
    }

    static final int MOD = 1_000_000_007;

    private static long solve(int S) {
        if (S < 3) return 0;

        long res = 0;
        for (int i = 1; i <= S / 3; i++) {
            int reminder = S - i * 3;
            // C(reminder + i - 1, i -1)
            long count = factorialModulo(reminder + i - 1)
                    * modInverse(factorialModulo(i - 1)) % MOD
                    * modInverse(factorialModulo(reminder)) % MOD;
            res = (res + count) % MOD;
        }

        return (res + MOD) % MOD;
    }

    static long factorialModulo(long n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i % MOD;
        }
        return res;
    }

    // modInverse(num) * num == 1 (MOD)
    static long modInverse(long num) {
        // raise num to MOD-2 power.
        long base = num;
        long inverse = 1;
        int exp = MOD - 2;
        while (exp > 0) {
            if (exp % 2 == 1) inverse = inverse * base % MOD;
            base = base * base % MOD;
            exp /= 2;
        }
        return inverse;
    }
}
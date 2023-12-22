import java.util.Scanner;

public class Main {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        for (long i = k; i <= n + 1; i++) {
            long min = (i - 1) * i / 2;
            long max = n * (n + 1) / 2 - (n - i) * (n - i + 1) / 2;
            ans = (ans + max - min + 1) % MOD;
        }
        System.out.println(ans);
    }

}

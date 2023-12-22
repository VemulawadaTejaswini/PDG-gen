import java.util.Scanner;

public class Main {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(scanner.next());
        }
        scanner.close();

        long ans = 0;
        for (int k = 0; k < 60; k++) {
            long x0 = 0;
            long x1 = 0;
            for (int i = 0; i < N; i++) {
                // k桁目をbit演算で取り出す
                long x = (arr[i] >> k) & 1;
                // k桁目が 0, 1 どちらかを数えておく
                if (x == 0) {
                    x0++;
                } else {
                    x1++;
                }
            }

            // p は 2の冪 (1,2,4,8...)
            long p = 1;
            for (int i = 0; i < k; i++) {
                p *= 2;
                p %= MOD;
            }

            // x0 * x1 が 0, 1 の組み合わせ数
            long count = (x0 * x1) % MOD;
            ans += count * p;
            ans %= MOD;
        }

        System.out.println(ans);
    }
}

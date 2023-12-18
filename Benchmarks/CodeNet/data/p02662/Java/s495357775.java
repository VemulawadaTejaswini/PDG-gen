
import java.util.Scanner;

public class Main {
    static long MOD = 998244353;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), S = in.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) A[i] = in.nextInt();
        long[] dp = new long[S+1];
        dp[0] = 1;
        for (int i=0;i<N;i++) {
            long[] tmp = new long[S+1];
            for (int j=S;j>=0;j--) {
                tmp[j] = (dp[j] * 2) % MOD;
            }
            for (int j=S-A[i];j>=0;j--) {
                tmp[j + A[i]] = (tmp[j + A[i]] + dp[j]) % MOD;
            }
            dp = tmp;
        }

        System.out.println(dp[S]);
    }
}

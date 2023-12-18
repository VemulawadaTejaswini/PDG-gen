import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int MOD = 1000000007;
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N + 1];
		for (int i = 0; i < N; ++i) {
			w[i] = sc.nextInt();
		}
		w[N] = 1 << 30;
		Arrays.sort(w);
		long ans = 0;
		int sum = 0;
		int[] dp = new int[W + 1];
		for (int i = 0; i <= N && sum <= W; ++i) {
			Arrays.fill(dp, 0);
			dp[sum] = 1;
			for (int j = i + 1; j < N; ++j) {
				for (int k = W; k - w[j] >= 0; --k) {
					dp[k] += dp[k - w[j]];
					if (dp[k] >= MOD) dp[k] -= MOD;
				}
			}
			for (int j = W; j + w[i] > W && j >= 0; --j) {
				ans += dp[j];
			}
			sum += w[i];
		}
		System.out.println(ans % MOD);
	}
}
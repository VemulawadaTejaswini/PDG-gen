import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] P = new int[M];
		for (int i = 0; i < M; ++i) {
			P[i] = sc.nextInt();
		}
		Arrays.sort(P);
		int[] dp = new int[M + 10001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i < N; ++i) {
			int C = sc.nextInt();
			int E = sc.nextInt();
			for (int j = dp.length - 1; j - C >= 0; --j) {
				if (dp[j - C] == Integer.MAX_VALUE) continue;
				dp[j] = Math.min(dp[j], dp[j - C] + E);
			}
		}
		int[] sum = new int[dp.length];
		for (int i = 0; i < M; ++i) {
			sum[i + 1] = sum[i] + P[M - 1 - i];
		}
		for (int i = M + 1; i < sum.length; ++i) {
			sum[i] = sum[M];
		}
		int ans = 0;
		for (int i = 0; i < sum.length; ++i) {
			if (dp[i] == Integer.MAX_VALUE) continue;
			ans = Math.max(ans, sum[i] - dp[i]);
		}
		System.out.println(ans);
	}
}
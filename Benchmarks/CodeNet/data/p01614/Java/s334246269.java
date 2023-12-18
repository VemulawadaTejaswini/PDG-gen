import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] dp = new int[394];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for (int i = 0; i < N; ++i) {
			int s = sc.nextInt();
			int l = sc.nextInt();
			int p = sc.nextInt();
			for (int j = 0; j < dp.length - s; ++j) {
				if (dp[j] == -1) continue;
				for (int k = s; k <= l && j + k < dp.length; ++k) {
					dp[j + k] = Math.max(dp[j + k], dp[j] + p);
				}
			}
		}
		int M = sc.nextInt();
		int[] ans = new int[M];
		for (int i = 0; i < M; ++i) {
			ans[i] = dp[sc.nextInt()];
			if (ans[i] == -1) {
				System.out.println(-1);
				return;
			}
		}
		for (int i = 0; i < M; ++i) {
			System.out.println(ans[i]);
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[][] t = new int[N][N + 1];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j <= N; ++j) {
					t[i][j] = sc.nextInt();
				}
			}
			int[] dp = new int[1 << N];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			for (int i = 0; i < (1 << N); ++i) {
				for (int j = 0; j < N; ++j) {
					int next = 1 << j;
					if ((i & next) != 0) continue;
					dp[i + next] = Math.min(dp[i + next], dp[i] + t[j][0]);
					for (int k = 0; k < N; ++k) {
						int prev = 1 << k;
						if ((i & prev) == 0) continue;
						dp[i + next] = Math.min(dp[i + next], dp[i] + t[j][k + 1]);
					}
				}
			}
			System.out.println(dp[(1 << N) - 1]);
		}
	}
}
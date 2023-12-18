import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] C;
	static int[][] P;

	public static void main(String[] args) {
		while (sc.hasNext()) {
			N = sc.nextInt();
			M = sc.nextInt();
			C = new int[N];
			P = new int[N][3];
			for (int i = 0; i < N; ++i) {
				sc.nextLine();
				sc.nextLine();
				C[i] = sc.nextInt();
				P[i][0] = sc.nextInt();
				P[i][1] = sc.nextInt();
				P[i][2] = sc.nextInt();
			}
			int ans = 0;
			for (int i = 0; i < 3; ++i) {
				int[] dp = new int[M + 1];
				Arrays.fill(dp, -1);
				dp[M] = 0;
				for (int j = 0; j < N; ++j) {
					for (int k = M - C[j]; k >= 0; --k) {
						if (dp[k + C[j]] != -1) {
							dp[k] = Math.max(dp[k], dp[k + C[j]] + P[j][i]);
						}
					}
				}
				for (int j = 0; j <= M; ++j) {
					ans = Math.max(ans, dp[j]);
				}
			}
			System.out.println(ans);
		}
	}

}
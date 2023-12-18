import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int K = sc.nextInt();
			if (K == 0) break;
			String s = sc.next();
			String t = sc.next();
			int[] d = new int[K];
			for (int i = 0; i < K; ++i) {
				d[i] = (10 + t.charAt(i) - s.charAt(i)) % 10;
			}
			int[][][] dp = new int[K][K][10];
			for (int[][] a : dp) {
				for (int[] aa : a) {
					Arrays.fill(aa, 1000);
				}
			}
			for (int i = 0; i < K; ++i) {
				for (int j = 0; j < 10; ++j) {
					dp[i][i][j] = d[i] == j ? 0 : 1;
				}
			}
			for (int len = 1; len < K; ++len) {
				for (int l = 0; l + len < K; ++l) {
					int r = l + len;
					for (int j = 0; j < 10; ++j) {
						dp[l][r][j] = Math.min(dp[l][r][j], dp[l + 1][r][j] + (d[l] == j ? 0 : 1));
						dp[l][r][j] = Math.min(dp[l][r][j], dp[l + 1][r][d[l]] + (d[l] == j ? 0 : 1));
						dp[l][r][j] = Math.min(dp[l][r][j], dp[l][r - 1][j] + (d[r] == j ? 0 : 1));
						dp[l][r][j] = Math.min(dp[l][r][j], dp[l][r - 1][d[r]] + (d[r] == j ? 0 : 1));
					}
				}
			}
			System.out.println(dp[0][K - 1][0]);
		}
	}
}
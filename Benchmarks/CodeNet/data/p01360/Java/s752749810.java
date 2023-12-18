import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			String steps = sc.next();
			if (steps.equals("#")) break;
			int N = steps.length();
			int[][][] dp = new int[2][2][9];
			int t = 0;
			Arrays.fill(dp[t][0], 1 << 30);
			Arrays.fill(dp[t][1], 1 << 30);
			int start = steps.charAt(0) - '1';
			int sc = start % 3;
			for (int i = 0; i < 9; ++i) {
				if (i == 4) continue;
				int cc = i % 3;
				if (sc <= cc) {
					dp[t][0][i] = 0;
				}
				if (cc <= sc) {
					dp[t][1][i] = 0;
				}
			}
			for (int i = 1; i < N; ++i) {
				Arrays.fill(dp[1 - t][0], 1 << 30);
				Arrays.fill(dp[1 - t][1], 1 << 30);
				int prev = steps.charAt(i - 1) - '1';
				int next = steps.charAt(i) - '1';
				int nc = next % 3;

				// left-left
				for (int j = 0; j < 9; ++j) {
					if (j == 4) continue;
					int cc = j % 3;
					if (nc > cc) continue;
					dp[1 - t][0][j] = Math.min(dp[1 - t][0][j], dp[t][0][j] + 1);
				}
				// left-right
				for (int j = 0; j < 9; ++j) {
					if (j == 4) continue;
					int cc = prev % 3;
					if (nc > cc) continue;
					dp[1 - t][0][prev] = Math.min(dp[1 - t][0][prev], dp[t][1][j]);
				}
				// right-right
				for (int j = 0; j < 9; ++j) {
					if (j == 4) continue;
					int cc = j % 3;
					if (nc < cc) continue;
					dp[1 - t][1][j] = Math.min(dp[1 - t][1][j], dp[t][1][j] + 1);
				}
				// right-left
				for (int j = 0; j < 9; ++j) {
					if (j == 4) continue;
					int cc = prev % 3;
					if (nc < cc) continue;
					dp[1 - t][1][prev] = Math.min(dp[1 - t][1][prev], dp[t][0][j]);
				}
				t = 1 - t;
			}
			int ans = 1 << 30;
			for (int i = 0; i < 9; ++i) {
				if (i == 4) continue;
				ans = Math.min(ans, dp[t][0][i]);
				ans = Math.min(ans, dp[t][1][i]);
			}
			System.out.println(ans);
		}
	}
}
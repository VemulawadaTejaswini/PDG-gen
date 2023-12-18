import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		long[][] dp = new long[s.length + 1][13];
		dp[0][0] = 1;
		for (int i = 1; i < dp.length; i++) {
			if (s[i - 1] == '?') {
				for (int j = 0; j < 10; j++) {
					for (int j2 = 0; j2 < 13; j2++) {
						dp[i][(j2 * 10 + j) % 13] += dp[i - 1][j2];
					}
				}
			} else {
				int j = s[i - 1] - '0';
				for (int j2 = 0; j2 < 13; j2++) {
					dp[i][(j2 * 10 + j) % 13] += dp[i - 1][j2];
				}
			}
			for (int j2 = 0; j2 < 13; j2++) {
				dp[i][j2] %= 1000000007;
			}
		}
		System.out.println(dp[s.length][5]);
	}
}

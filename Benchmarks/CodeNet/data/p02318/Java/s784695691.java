import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s1 = sc.next().toCharArray();
		char[] s2 = sc.next().toCharArray();
		int n = s1.length;
		int m = s2.length;

		int[][] dp = new int[2][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0) {
					dp[i % 2][j] = j;
				} else if (j == 0) {
					dp[i % 2][0] = i;
				} else {
					if (s1[i - 1] == s2[j - 1]) {
						dp[i % 2][j] = Math.min(dp[(i - 1) % 2][j - 1], dp[(i - 1) % 2][j] + 1);
					} else {
						dp[i % 2][j] = Math.min(dp[(i - 1) % 2][j - 1] + 1, dp[(i - 1) % 2][j] + 1);
					}
					dp[i % 2][j] = Math.min(dp[i % 2][j], dp[i % 2][j - 1] + 1);
				}
			}
		}

		System.out.println(dp[n % 2][m]);
		
		sc.close();
	}
}
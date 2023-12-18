import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int w[], v[];
		int c;
		int dp[][];
		int caseNumber;

		c = sc.nextInt();
		caseNumber = 1;
		while (c != 0) {
			n = sc.nextInt();
			w = new int[n];
			v = new int[n];
			dp = new int[n][c + 1];
			for (int i = 0; i < n; i++) {
				String s[] = sc.next().split(",");
				v[i] = Integer.valueOf(s[0]);
				w[i] = Integer.valueOf(s[1]);
			}
			for (int i = 0; i < c + 1; i++) {
				if (i < w[0]) {
					dp[0][i] = 0;
				} else {
					dp[0][i] = v[0];
				}
			}
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < c + 1; j++) {
					if (j < w[i]) {
						dp[i][j] = dp[i - 1][j];
					} else if (j == w[i]) {
						if (dp[i - 1][j] < v[i]) {
							dp[i][j] = v[i];
						} else {
							dp[i][j] = dp[i - 1][j];
						}
					} else {
						if (dp[i - 1][j] < v[i] + dp[i - 1][j - w[i]]) {
							dp[i][j] = v[i] + dp[i - 1][j - w[i]];
						} else {
							dp[i][j] = dp[i - 1][j];
						}
					}
				}
			}
			System.out.println("Case " + caseNumber + ":");
			for (int i = c; 0 < i; i--) {
				if (dp[n - 1][i] != dp[n - 1][i - 1]) {
					System.out.println(dp[n - 1][c]);
					System.out.println(i);
					break;
				}
			}
			c = sc.nextInt();
			caseNumber++;
		}
	}
}
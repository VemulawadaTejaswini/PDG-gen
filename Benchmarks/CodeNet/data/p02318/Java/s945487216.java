

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		for (int j = 0; j <= m; j++) {
			dp[0][j] = j;
		}
		for (int i = 0; i < n; i++) {
			dp[i+1][0] = i+1;
			for (int j = 0; j < m; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i+1][j+1] = dp[i][j];	
				} else {
					dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i+1][j]) + 1;
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
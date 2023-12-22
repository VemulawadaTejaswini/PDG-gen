

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] d = new int[m];
		for (int i = 0; i < m; i++) {
			d[i] = sc.nextInt();
		}
		int[][] dp = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = Integer.MAX_VALUE; 
			}
		}
		dp[0][0] = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 1; j <= n; j++) {
				
				int di = d[i];
				if (j >= di)
					dp[i+1][j] = Math.min(dp[i][j], dp[i+1][j-di] + 1);
				else
					dp[i+1][j] = dp[i][j];
			}
		}
		System.out.println(dp[m][n]);
	}
}
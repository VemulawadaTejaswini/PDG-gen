

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[][] dp = new int[n][n];


		for(int j = n-1; j>=0; j--) {
			int i = n-1;
			if(s.charAt(i) == s.charAt(j)) dp[i][j] = 1;
			else dp[i][j] = 0;
		}

		for(int i=n-1; i>=0; i--) {
			int j = n-1;
			if(s.charAt(i) == s.charAt(j)) dp[i][j] = 1;
			else dp[i][j] = 0;
		}

		for(int i = n-2; i>=0; i--) {
			for(int j = n-2; j>=0; j--) {
				if(s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i+1][j+1]+1;
				else dp[i][j] = 0;
			}
		}

		int len = 0;
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i+dp[i][j] <= j) len = Math.max(len, dp[i][j]);
			}
		}
		System.out.println(len);
	}
}

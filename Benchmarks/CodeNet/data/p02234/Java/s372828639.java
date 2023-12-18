import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		System.out.println(solve(n, r, c));
	}
	
	public static int solve(int n, int[] r, int[] c) {
		int[][] dp = new int[n][n];
		
		for (int k = 1; k < n; k++) {
			int i = 0;
			int j = k;
			while(j < n) {
				dp[i][j] = Integer.MAX_VALUE;
				for (int d = i; d < j; d++) { 
					// (i-d) x (d-j)
					dp[i][j] = Math.min(dp[i][j], dp[i][d] + dp[d+1][j] + r[i] * c[d] * c[j]); 
				}
				i++;
				j++;
			}
		}
		
		return dp[0][n-1];
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n-1; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = sc.nextInt();
		
		System.out.println(solve(n, arr, ans));
	}
	
	public static long solve(int n, int[] arr, int ans) {
		long[][] dp = new long[n+1][21];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}
		dp[0][0] = 1;
		dp[1][arr[0]] = 1;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 0; j <= 20; j++) {
				if (dp[i][j] < 0) 
					continue;
				if (j + arr[i] <= 20) {
					if (dp[i+1][j+arr[i]] < 0) 
						dp[i+1][j+arr[i]] = 0;
					dp[i+1][j + arr[i]] += dp[i][j];
				}
				if (j - arr[i] >= 0) {
					if (dp[i+1][j - arr[i]] < 0)
						dp[i+1][j - arr[i]] = 0;
					dp[i+1][j - arr[i]] += dp[i][j];
				}
			}
		}
		return dp[n-1][ans];
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[2][n];
		dp[0][0] = a[0][0];
		dp[1][0] = a[1][0] + a[0][0];
		if(n != 1) {
			dp[0][1] = a[0][1] + a[0][0];
		}
		for(int i = 2 ; i < n ; i++) {
			dp[0][i] = dp[0][i - 1] + a[0][i];
		}
		for(int i = 1 ; i < n ; i++) {
			dp[1][i] = Math.max(dp[1][i - 1] + a[1][i], dp[0][i] + a[1][i]);
		}
		System.out.println(dp[1][n - 1]);
	}
}

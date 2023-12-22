import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long dp[][] = new long[n][n];
		for ( int i = 0; i < n; i++ ) {
			dp[i][i] = in.nextInt();
		}
		in.close();

		for ( int col = 1; col < n; col++ ) {
			int r = 0, c = col;
			while ( c < n ) {
				dp[r][c] = Math.max(dp[r][r] - dp[r + 1][c], dp[c][c] - dp[r][c - 1]);
				r++;
				c++;
			}
		}
		System.out.println(dp[0][n - 1]);
	}
}
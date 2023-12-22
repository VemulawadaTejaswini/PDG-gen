import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE/10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int open = 1<<n;
		int[][] dp = new int[m+1][open];

		for(int i = 0; i <= m; i++) {
			for(int j = 0; j < open; j++) {
				dp[i][j] = INF;
			}
		}

		/*for(int i = 0; i <= m; i++) {
			dp[i][0] = 0;
		}*/
		dp[0][0] = 0;

		for(int i = 1; i <= m; i++) {
			int price = sc.nextInt();
			int b = sc.nextInt();
			int d = 0;
			for(int k = 0; k < b; k++) {
				int c = sc.nextInt();
				d += 1<<(c-1);
			}
			for(int j = 0; j < open; j++) {
				dp[i][j] = dp[i-1][j];
			}
			for(int j = 0; j < open; j++) {
				int jord = j|d;
				dp[i][jord] = Math.min(dp[i][jord], dp[i-1][j] + price);
			}
			/*for(int j = 0; j < open; j++) {
				int jord = j|d;
				dp[i][jord] = Math.min(Math.min(dp[i-1][jord], dp[i][jord]), dp[i-1][j] + price);
			}*/
		}

		int ans = dp[m][open-1];

		System.out.println(ans!=INF ? ans : -1);

		sc.close();
	}

}
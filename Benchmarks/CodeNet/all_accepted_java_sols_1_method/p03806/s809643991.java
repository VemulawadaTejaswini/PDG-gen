import java.util.Scanner;

public class Main {
	
	private static int[][][] dp = new int[41][410][410];
	private static int[] a = new int[41];
	private static int[] b = new int[41];
	private static int[] c = new int[41];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i , j , k , n , ma , mb;
		n = scan.nextInt();
		ma = scan.nextInt();
		mb = scan.nextInt();
		
		for (i = 0;i < 41;i ++)
			for (j = 0;j < 410;j ++)
				for (k = 0;k < 410;k ++) {
					dp[i][j][k] = - 1;
				}
		
		for (i = 0;i < n;i ++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		
		dp[0][a[0]][b[0]] = c[0];
		dp[0][0][0] = 0;
		
		for (i = 1;i < n;i ++) {
			for (j = 0;j <= 400;j ++)
				for (k = 0;k <= 400;k ++) {
					dp[i][j][k] = dp[i - 1][j][k];
				}
			for (j = 0;j <= 400;j ++)
				for (k = 0;k <= 400;k ++) {
					if (dp[i - 1][j][k] >= 0) {
						int temp = dp[i - 1][j][k] + c[i];
						int x = j + a[i];
						int y = k + b[i];
						if (dp[i][x][y] < 0 || temp < dp[i][x][y]) {
							dp[i][x][y] = temp;
						}
					}
				}
		}
		int ans = - 1;
		for (i = 1;i <= 400;i ++)
			for (j = 1;j <= 400;j ++) {
				if (dp[n - 1][i][j] >= 0) {
					if (i * mb == ma * j) {
						if (dp[n - 1][i][j] < ans || ans < 0)
							ans = dp[n - 1][i][j];
					}
				}
			}
		System.out.println(ans);
		
	}
	
}




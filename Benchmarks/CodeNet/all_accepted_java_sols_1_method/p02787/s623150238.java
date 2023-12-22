import java.util.Scanner;

public class Main {
	public static final int inf = 100000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[][] dp = new int[1001][20000];
		for (int i = 0; i < 20000; i++) {
			dp[0][i] = inf;
		}
		for (int i = 0; i < 1001; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= h; j++) {
				if(j-a[i]<=0) {
					dp[i+1][j] = Math.min(dp[i][j],b[i]);
				}else {
					dp[i+1][j] = Math.min(dp[i][j],dp[i+1][j-a[i]]+b[i]);
				}
			}
		}
		System.out.println(dp[n][h]);
		sc.close();
	}
}
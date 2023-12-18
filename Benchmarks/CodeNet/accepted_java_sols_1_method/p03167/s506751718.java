import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		long mod = (long)1e9+7;
		char[][] a = new char[h][w];
		long[][] dp = new long[h][w];
		for (int i = 0; i < h; i++) a[i] = sc.next().toCharArray();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if(a[i][j] == '.') {
					if(j-1>=0&&a[i][j-1]=='.') {
						dp[i][j] += dp[i][j-1];
						dp[i][j] %= mod;
					}
					if(i-1>=0&&a[i-1][j]=='.') {
						dp[i][j] += dp[i-1][j];
						dp[i][j] %= mod;
					}
					if(i==0&&j==0) dp[i][j] = 1;
				}
			}
		}
		System.out.println(dp[h-1][w-1]);
		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0) {
				break;
			}
			int n = sc.nextInt();
			boolean[][] c = new boolean[a+1][b+1];
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				c[x][y] = true;
			}
			int[][] dp = new int[a+1][b+1];
			dp[0][1] = 1;
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=b;j++) {
					if (!c[i][j]) {
						dp[i][j] = dp[i-1][j] + dp[i][j-1];
					}
				}
			}
			System.out.println(dp[a][b]);
		}
	}

}
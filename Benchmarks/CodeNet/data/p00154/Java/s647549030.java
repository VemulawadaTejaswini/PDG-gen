
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			if(m == 0) break;
			int[] a = new int[m+1];
			int[] b = new int[m+1];
			for(int i=1;i<=m;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			int g = sc.nextInt();
			int[] n = new int[g];
			for(int i=0;i<g;i++) {
				n[i] = sc.nextInt();
			}
			int[][] dp = new int[m+1][1001];  // dp[i][j] = i以下の整数を用いてjを作るときの組み合わせ数
			dp[0][0] = 1;
			for(int i=1;i<=m;i++) {
				for(int j=0;j<=1000;j++) {
					for(int k=0;k<=b[i];k++) {
						if(j - k*a[i] < 0) break;
						dp[i][j] += dp[i-1][j - k*a[i]];
					}
				}
			}
			for(int i=0;i<g;i++) {
				System.out.println(dp[m][n[i]]);
			}
		}
	}
}
		


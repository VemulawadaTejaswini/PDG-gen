import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] v = new int[N];
		int[] w = new int[N];
		for(int i=0;i<N;i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int[][] dp = new int[N+1][W+1];
		for(int j=0;j<=W;j++) {
			dp[0][j] = 0;
		}
		for(int i=0;i<=N;i++) {
			dp[i][0] = 0;
		}
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=W;j++) {
				if(w[i-1]<=j) {
					dp[i][j] = Math.max(dp[i-1][j-w[i-1]] + v[i-1], dp[i-1][j]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[N][W]);
	}	
}




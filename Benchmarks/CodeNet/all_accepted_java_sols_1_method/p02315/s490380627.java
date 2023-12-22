import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] v = new int[N];
		int[] w = new int[N];
		for (int i=0;i<N;i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}

		int[][] dp = new int[N+1][W+1];
		for (int i=0;i<N;i++) {
			for (int b=0;b<W+1;b++) {
				if (b-w[i]>=0) {
					dp[i+1][b]=Math.max(dp[i][b],dp[i][b-w[i]]+v[i]);
				}else {
					dp[i+1][b]=dp[i][b];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}

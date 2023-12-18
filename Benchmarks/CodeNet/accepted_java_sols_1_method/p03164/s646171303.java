import java.util.Scanner;

public class Main {

	private static int N;
	private static int W;
	private static long[][] dp;
	private static int[] w;
	private static int[] v;
	final static Long INF = Long.MAX_VALUE/100;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();
		dp = new long[N+1][N*1000+1];
		w = new int[N+1];
		v = new int[N+1];
		w[0] = 0; v[0] = 0;
		for(int i = 1; i <= N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N*1000; j++) {
				dp[i][j] = INF;
			}
		}
		for(int i = 0; i <= N; i++) {
			dp[i][0] = 0;
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N*1000; j++) {
				if(j-v[i] >= 0) {
					dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v[i]]+w[i]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}

		for(int i = N*1000; i >= 0; i--) {
			if(dp[N][i] <= W) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
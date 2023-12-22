import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int inf = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N+2];
		Arrays.fill(h, inf);
		for(int i=0; i < N; i++) h[i] = sc.nextInt();
		int[] dp = new int[N+2];
		Arrays.fill(dp, inf);
		dp[0] = 0;
		for(int i = 0; i < N; i++) {
			dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1]));
			dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
		}
		System.out.println(dp[N-1]);
				/*
		 * N

		 */
	}
}

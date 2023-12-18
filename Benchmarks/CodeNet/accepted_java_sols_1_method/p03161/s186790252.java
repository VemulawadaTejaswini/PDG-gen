import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int inf = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N+K];
		Arrays.fill(h, inf);
		for(int i=0; i < N; i++) h[i] = sc.nextInt();
		int[] dp = new int[N+K];
		Arrays.fill(dp, inf);
		dp[0] = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 1; j <= K; j++)
			dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i] - h[i+j]));
		}
		System.out.println(dp[N-1]);
	}
}

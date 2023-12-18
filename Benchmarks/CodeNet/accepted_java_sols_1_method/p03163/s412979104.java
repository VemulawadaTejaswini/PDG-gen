import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long[][] dp = new long[N + 1][W + 1];
		int[] weight = new int[N];
		int[] value = new int[N];

		for(int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= W; j++) {
				if(weight[i] <= j) {
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - weight[i]] + value[i]);
				}else {
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j]);
				}
			}
		}

		System.out.println(dp[N][W]);

		sc.close();
	}
}

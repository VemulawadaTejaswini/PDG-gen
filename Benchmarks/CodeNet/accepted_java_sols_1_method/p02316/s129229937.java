import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();
		int[]v = new int[N + 1];
		int[]w = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			v[i] = scan.nextInt();
			w[i] = scan.nextInt();
		}
		scan.close();
		int[]dp = new int[W + 1];
		dp[0] = 0;
		int max = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				if(j + w[i] <= W) {
					dp[j + w[i]] = Math.max(dp[j + w[i]], dp[j] + v[i]);
					max = Math.max(max, dp[j + w[i]]);
				}
			}
		}
		System.out.println(max);
	}
}

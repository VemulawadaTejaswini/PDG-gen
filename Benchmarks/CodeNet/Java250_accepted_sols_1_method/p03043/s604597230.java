import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		double[] dp = new double[K + 1];
		Arrays.fill(dp, 0);
		for (int i = 1;i <= Math.min(N, K);++ i) dp[i] = 1.0 / N;
		dp[K] += (double)Math.max(0, N - K) / N;
		for (int i = 1;i < K;++ i) dp[Math.min(i * 2, K)] += dp[i] / 2;
		System.out.println(dp[K]);
	}
}
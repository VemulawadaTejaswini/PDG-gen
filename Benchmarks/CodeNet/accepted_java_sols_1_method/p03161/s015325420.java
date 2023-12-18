import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		int[] h = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] dp = Arrays.stream(new int[N]).map(s -> Integer.MAX_VALUE / 2).toArray();

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				dp[i] = 0;
			} else {
				for (int j = 1; j <= K; j++) {
					if (i - j >= 0) {
						dp[i] = Math.min(dp[i], Math.abs(h[i] - h[i - j]) + dp[i - j]);
					}
				}
			}
		}
		System.out.println(dp[N - 1]);
	}
}
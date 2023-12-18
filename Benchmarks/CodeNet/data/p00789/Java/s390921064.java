import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long[] dp = new long[301];
		Arrays.fill(dp, 1);
		for (int i = 2; i <= 17; ++i) {
			for (int j = 300; j >= i * i; --j) {
				for (int k = 1; j - k * i * i >= 0; ++k) {
					dp[j] += dp[j - k * i * i];
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			System.out.println(dp[N]);
		}
	}
}
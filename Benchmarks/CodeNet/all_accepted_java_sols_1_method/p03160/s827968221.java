import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] h = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] dp = new int[N];

		dp[1] = Math.abs(h[1] - h[0]);
		for (int i = 2; i < N; i++) {
			dp[i] = Math.min(Math.abs(h[i] - h[i - 1]) + dp[i - 1], Math.abs(h[i] - h[i - 2]) + dp[i - 2]);
		}
		System.out.println(dp[N - 1]);
	}
}
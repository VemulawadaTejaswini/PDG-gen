import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static int N;
	static int[] nums;
	static int[] dp;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int[] nums = new int[N+1];
		int[] dp = new int[N+1];


		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.fill(dp, Integer.MAX_VALUE);

		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			dp[i] = Math.min(dp[i], dp[i-1] + Math.abs(nums[i] - nums[i-1]));
			if (i>1) {
				dp[i] = Math.min(dp[i], dp[i-2] + Math.abs(nums[i] - nums[i-2]));
			}
		}

		System.out.println(dp[N-1]);

	}
}

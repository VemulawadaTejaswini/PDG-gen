import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long height[] = new long[num];
		for(int i = 0; i < num; i ++) {
			height[i] = sc.nextLong();
		}
		long dp[] = new long[num];
		for(int i = 0; i < num; i ++) {
			dp[i] = i == 0 ? 0
				: i == 1 ? Math.abs(height[i] - height[i - 1])
				: Math.min(dp[i - 1] + Math.abs(height[i] - height[i - 1]),
					dp[i - 2] + Math.abs(height[i] - height[i - 2]));
		}
		System.out.println(dp[num - 1]);
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long nums[] = new long[n];
		long dp[] = new long[n];		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0 ; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(i + 1 < n)
				dp[i+1] = Math.min(dp[i+1],  Math.abs(nums[i] - nums[i+1]) + dp[i]);
			if(i + 2 < n)
				dp[i+2] = Math.min(dp[i+2],  Math.abs(nums[i] - nums[i+2]) + dp[i]);
		}
		System.out.println(dp[n-1]);
	}
}

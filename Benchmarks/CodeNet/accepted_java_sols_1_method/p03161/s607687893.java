
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long nums[] = new long[n];
		long dp[] = new long[n];		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0 ; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n && j <= i+k; j++) {
				dp[j] = Math.min(dp[j],  Math.abs(nums[i] - nums[j]) + dp[i]);				
			}
		}
		System.out.println(dp[n-1]);
	}
}

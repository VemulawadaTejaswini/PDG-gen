import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = kb.nextInt();
		}
		int[] dp = new int[n];
		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);
		for(int i =2; i < n; i++) {
			int one = dp[i-1] + Math.abs(h[i-1] - h[i]);
			int two = dp[i-2] + Math.abs(h[i-2] - h[i]);
			dp[i] = Math.min(one, two);
		}
		System.out.println(dp[n-1]);
		//System.out.println(Arrays.toString(dp));
	}
	
}

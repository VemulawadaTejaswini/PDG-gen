import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		int []h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		
		dp[0] = 0;
		
		for(int i = 0; i < n; i++) {
			if(i == n-2) {
				dp[i+1] = Math.min(dp[i] + Math.abs(h[i+1]-h[i]), dp[i+1]);
				break;
			}
			
			dp[i+1] = Math.min(dp[i]+Math.abs(h[i+1]-h[i]),dp[i+1]);
			dp[i+2] = Math.min(dp[i]+Math.abs(h[i+2]-h[i]),dp[i+2]);
			
		}
		System.out.println(dp[n-1]);
		
	}

}

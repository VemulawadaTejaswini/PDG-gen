import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //足場の数
		
		int k = stdIn.nextInt();
		
		int[] h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		dp[1] = Math.abs(h[1]- h[0]);
		
		for(int i = 0; i < n; i++ ) {
			
			for(int j = i+1; j <= i+k; j++) {
				if(j >= n) {
					break;
				}
				dp[j] = Math.min(dp[i]+Math.abs(h[j]-h[i]),dp[j]);
						
				
			}
			
			
			
		}
		System.out.println(dp[n-1]);
		
		
	}

}

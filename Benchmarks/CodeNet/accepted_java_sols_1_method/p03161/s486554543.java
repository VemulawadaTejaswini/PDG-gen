import java.util.*;
import java.lang.*;

public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		sc.nextLine();
		int[] heights = new int[n];
		for(int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}
		
		int[] dp = new int[n]; //min number of cost before reaching i
		for (int i = 0; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			for(int j = i+1; j <= i+k; j++) {
				if(j < n) {
					dp[j] = Math.min(dp[j], dp[i] + Math.abs(heights[i] - heights[j]));
				}
			}
			
		}
		System.out.println(dp[n-1]);
	}
	 
}
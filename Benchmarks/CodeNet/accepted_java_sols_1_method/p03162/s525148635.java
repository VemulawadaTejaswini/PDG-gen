import java.util.*;
import java.lang.*;


 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] dp = new int[n][3]; //max happy points with act i on last considered day
		
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		//3 cases: chose a,b or c on previous go
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) { // activity on ith day
				if(i == 0) { //first day
					if(j == 0) {
						dp[i][j] = a[0];
					}else if(j == 1) {
						dp[i][j] = b[0];
					}else {
						dp[i][j] = c[0];
					}
				}else {
					for(int k = 0; k < 3; k++) { // activity on previous day
						if(j == k) {
							continue;
						}else {
							if(j == 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + a[i]);
							else if(j == 1) dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + b[i]);
							else dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + c[i]);
						}
					}
				}
				
			}
		}
		
		System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
			
		}
}
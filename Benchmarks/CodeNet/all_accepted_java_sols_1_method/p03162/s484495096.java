import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] dp = new int[n+100][3];
		int[][] a = new int[n+100][3];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j == k) continue;
					dp[i+1][k] = Math.max(dp[i+1][k], dp[i][j] + a[i][k]);
				}
			}
		}
		
		int res = 0;
		for(int j = 0; j < 3; j++) res = Math.max(res, dp[n][j]);
		System.out.println(res);
		
	}
}
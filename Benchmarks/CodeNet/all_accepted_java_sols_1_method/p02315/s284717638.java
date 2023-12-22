
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int w = sc.nextInt();
			int[] v = new int [n+1];
			int[] we = new int [n+1];
			int[][] dp = new int[n+1][w+1];
			for(int i=1;i<n+1;i++) {
				v[i] = sc.nextInt();
				we[i] = sc.nextInt();
			}
			
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<w+1;j++) {
					if(j < we[i]) {
						dp[i][j] = dp[i-1][j];
					}
					else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - we[i]] + v[i]);
					}
				}
			}
			System.out.println(dp[n][w]);
			
		}
	}
}



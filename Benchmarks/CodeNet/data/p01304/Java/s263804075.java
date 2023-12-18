import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	final static int UP_OK = 1;
	final static int RIGHT_OK = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			final int gx = sc.nextInt();
			final int gy = sc.nextInt();
			
			long[][] dp = new long[gy+1][gx+1];
			dp[0][0] = 1;
			
			int[][] path = new int[gy+1][gx+1];
			
			for(int j = 0; j <= gy; j++){
				for(int k = 0; k <= gx; k++){
					if(j != gy){
						path[j][k] |= UP_OK;
					}
					if(k != gx){
						path[j][k] |= RIGHT_OK;
					}
				}
			}
			
			final int p = sc.nextInt();
			
			for(int j = 0; j < p; j++){
				final int fx = sc.nextInt();
				final int fy = sc.nextInt();
				final int tx = sc.nextInt();
				final int ty = sc.nextInt();
				
				if(fx == tx){
					path[Math.min(fy, ty)][fx] &= ~UP_OK;
				}else{
					path[fy][Math.min(fx, tx)] &= ~RIGHT_OK;
				}
			}
			
			for(int j = 0; j <= gy; j++){
				for(int k = 0; k <= gx; k++){
					//System.out.println(j + " " + k + " " + dp[j][k] + " " + path[j][k]);
					
					if((path[j][k] & UP_OK) != 0){
						dp[j+1][k] += dp[j][k];
					}
					
					if((path[j][k] & RIGHT_OK) != 0){
						dp[j][k+1] += dp[j][k];
					}
				}
			}
			
			if(dp[gy][gx] == 0){
				System.out.println("Miserable Hokusai!");
			}else{
				System.out.println(dp[gy][gx]);
			}
			
		}
	}

}
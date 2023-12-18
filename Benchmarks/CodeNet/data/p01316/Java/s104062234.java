import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n+m == 0) break;
				
				int[] x = new int[n];
				int[] c = new int[m];
				for(int i=0; i<m; i++) {
					c[i] = sc.nextInt();
				}
				for(int i=0; i<n; i++) {
					x[i] = sc.nextInt();
				}
				
				int[][] dp = new int[2][256];
				Arrays.fill(dp[0], 1<<30);
				dp[0][128] = 0;
				int t = 0;
				for(int i=0; i<n; i++) {
					Arrays.fill(dp[1-t], 1<<30);
					for(int j=0; j<256; j++) {
						for(int k=0; k<m; k++) {
							int next = j + c[k];
							if(next < 0) next = 0;
							if(next > 255) next = 255;
							dp[1-t][next] = Math.min(dp[1-t][next], dp[t][j] + (x[i]-next) * (x[i]-next));
						}
					}
					t = 1 - t;
				}
				int min = Integer.MAX_VALUE;
				for(int i=0; i<256; i++) {
					min = Math.min(min, dp[t][i]);
				}
				System.out.println(min);
			}
		}
	}
}


import java.util.*;
public class Main {
	public static int[][] dp;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int dataSetNumber = 1;
		while(true) {
			int W = stdIn.nextInt();
			if(W == 0) break;
			int N = stdIn.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];
			for(int i = 0; i < N; i++) {
				String tmp = stdIn.next();
				String[] tmp2 = tmp.split(",");
				v[i] = Integer.parseInt(tmp2[0],10);
				w[i] = Integer.parseInt(tmp2[1],10);
			}
			dp = new int[N+1][W+1];
			
			for(int i = 1; i <= N; i++) {
				for(int j = 0; j <= W; j++) {
					if(j - w[i-1] >= 0) {
						int c1 = dp[i - 1][j];
						int c2 = dp[i-1][j - w[i-1]] + v[i-1];
						if(c1 < c2) {
							dp[i][j] = dp[i-1][j - w[i-1]] + v[i-1];
						}
						else {
							dp[i][j] = dp[i-1][j];
						}
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
			System.out.println("Case " + dataSetNumber + ":");
			dataSetNumber++;
			System.out.println(dp[N][W]);
			int max = dp[N][W];
			for(int i = 0; i <= W; i++) {
				if(dp[N][i] == max) {
					System.out.println(i);
					break;
				}
			}
			
		}
		
		

	}

}
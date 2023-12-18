import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();

				int n = Integer.parseInt(line);

				if(n==0) break;

				line = br.readLine();

				char s = line.split(" ")[0].charAt(0), t = line.split(" ")[1].charAt(0), b = line.split(" ")[2].charAt(0);

				/* processing */
				double dp[][][][] = new double[15][9][9][9];
				for(int i=0;i<15;i++){
					for(int j=0;j<9;j++){
						for(int k=0;k<9;k++){
							for(int l=0;l<9;l++){
								dp[i][j][k][l] = -1;
							}
						}
					}
				}

				double ans = solve(dp, n,s-'A',t-'A',b-'A');
				/* output */
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static double solve(double[][][][] dp, int n, int s, int t, int b){
		if(dp[n][s][t][b]>=0) return dp[n][s][t][b];
		if(n==0){
			if(s==t){
				dp[n][s][t][b] = 1.0;
				return 1.0;
			} else {
				dp[n][s][t][b] = 0.0;
				return 0.0;
			}
		} else {
			double ret = 0;
			if(dp[n-1][s>2&&b!=s-3?s-3:s][t][b]>=0){
				ret += 0.25*dp[n-1][s>2&&b!=s-3?s-3:s][t][b];
			} else {
				dp[n-1][s>2&&b!=s-3?s-3:s][t][b] = solve(dp,n-1,s>2&&b!=s-3?s-3:s,t,b); 
				ret += 0.25*dp[n-1][s>2&&b!=s-3?s-3:s][t][b];
			}
			if(dp[n-1][s%3!=2&&b!=s+1?s+1:s][t][b]>=0){
				ret += 0.25*dp[n-1][s%3!=2&&b!=s+1?s+1:s][t][b];
			} else {
				dp[n-1][s%3!=2&&b!=s+1?s+1:s][t][b] = solve(dp,n-1,s%3!=2&&b!=s+1?s+1:s,t,b); 
				ret += 0.25*dp[n-1][s%3!=2&&b!=s+1?s+1:s][t][b];
			}
			if(dp[n-1][s<6&&b!=s+3?s+3:s][t][b]>=0){
				ret += 0.25*dp[n-1][s<6&&b!=s+3?s+3:s][t][b];
			} else {
				dp[n-1][s<6&&b!=s+3?s+3:s][t][b] = solve(dp,n-1,s<6&&b!=s+3?s+3:s,t,b);
				ret += 0.25*dp[n-1][s<6&&b!=s+3?s+3:s][t][b];
			}
			if(dp[n-1][s%3!=0&&b!=s-1?s-1:s][t][b]>=0){
				ret += 0.25*dp[n-1][s%3!=0&&b!=s-1?s-1:s][t][b];
			} else {
				dp[n-1][s%3!=0&&b!=s-1?s-1:s][t][b] =solve(dp,n-1,s%3!=0&&b!=s-1?s-1:s,t,b);
				ret += 0.25*dp[n-1][s%3!=0&&b!=s-1?s-1:s][t][b];
			}
			
			dp[n][s][t][b] = ret;
			return ret;
		}
	}
}
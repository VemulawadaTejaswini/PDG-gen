import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int dp[][] = new int[20010][256];
		while(true){
			int n = in.nextInt(), m = in.nextInt();
			if(n==0 && m==0) return ;
			int cs[] = new int[m], xs[] = new int[n];
			for(int i=0; i<m; i++){
				cs[i] = in.nextInt();
			}
			for(int i=0; i<n; i++){
				xs[i] = in.nextInt();
			}
			for(int i=0; i<n+1; i++)
				for(int j=0; j<256; j++)
					dp[i][j] = 1<<30;
			dp[0][128] = 0;
			for(int i=0; i<n; i++){
				for(int j=0; j<256; j++){
					for(int k=0; k<m; k++){
						int next = round(j+cs[k]);
						dp[i+1][next] = Math.min(dp[i+1][next], dp[i][j] + sq(xs[i]-next));
					}
				}
			}
			int ans = 1<<30;
			for(int i=0; i<256; i++)
				ans = Math.min(ans, dp[n][i]);
			System.out.println(ans);
		}
	}
	
	private static int round(int x){
		return x>255?255:x<0?0:x;
	}
	
	private static int sq(int x){
		return x*x;
	}
}
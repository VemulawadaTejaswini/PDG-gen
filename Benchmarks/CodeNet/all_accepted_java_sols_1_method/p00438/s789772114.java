import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int INF_MIN = -1000;//Integer.MIN_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){

			int H = Integer.parseInt(sc.next());
			int W = Integer.parseInt(sc.next());
			if(H==0 && W==0)break;
			int n = Integer.parseInt(sc.next());
			int[][] dp = new int[H+1][W+1];
			
			
			
			for(int i=0; i<n; i++){
				int stop_h = Integer.parseInt(sc.next())-1;
				int stop_w= Integer.parseInt(sc.next())-1;
				dp[stop_h][stop_w] = INF_MIN;
			}
			
			dp[0][0] = 1;
			
			for(int i=1; i<=H; i++){
				if(dp[i-1][0] == INF_MIN || dp[i][0] == INF_MIN ){
					dp[i][0] = INF_MIN;
				}else{
					dp[i][0] = 1;
				}
			}
			for(int i=1; i<=W; i++){
				if(dp[0][i-1] == INF_MIN || dp[0][i] == INF_MIN ){
					dp[0][i] = INF_MIN;
				}else{
					dp[0][i] = 1;
				}
			}			

			
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					if(dp[i+1][j+1] != INF_MIN){
						if(dp[i][j+1] != INF_MIN)dp[i+1][j+1] += dp[i][j+1];
						if(dp[i+1][j] != INF_MIN)dp[i+1][j+1] += dp[i+1][j];
					}
				}
			}
			/*
			for(int i=0; i<=H; i++){
				for(int j=0; j<=W; j++){
					System.out.print(dp[i][j] + "\t");
				}
				System.out.println();
			}
			*/

			System.out.println(dp[H-1][W-1]);
			
		}
		
		
	}
}



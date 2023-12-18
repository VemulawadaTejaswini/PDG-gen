import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}

	String[] board;
	boolean[][] dp;
	int h,w;
	int[] vx = new int[]{1,0,-1,0};
	int[] vy = new int[]{0,1,0,-1};
	int ret = 0;

	void calc(){
		Scanner cin = new Scanner(System.in);
		int h = cin.nextInt();
		int w = cin.nextInt();
		int[][] dp = new int[h][w];
		String[] board = new String[h];
		for(int i=0;i<h;i++) board[i] = cin.next();
		for(int i = 0;i < h; i++){
			for(int j=0;j<w; j++){
				dp[i][j] = 99999999;
			}
		}
		dp[0][0] = 0;
		for(int i = 0;i < h; i++){
			for(int j=0;j<w; j++){
				dp[i][j] += board[i].charAt(j) - '0';
				if(i!=h-1) dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				if(j!=w-1) dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j]);
			}
		}
		System.out.println(dp[h-1][w-1]);
	}

}
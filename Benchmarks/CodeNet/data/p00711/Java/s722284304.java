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
		while(true){
			w = cin.nextInt();
			h = cin.nextInt();
			if(w==0) break;
			int i,j;
			ret = 0;
			board = new String[h];
			dp = new boolean[h][w];
			for(i=0;i<h;i++){
				board[i] = cin.next();
			}
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					if(board[i].charAt(j)=='@'){
						ret = 1;
						dp[i][j] = true;
						dfs(i,j);
					}
				}
			}
			System.out.println(ret);
		}
	}

	void dfs(int y, int x){
		for(int i=0;i<4;i++){
			int ny = y + vy[i];
			int nx = x + vx[i];
			if(ok(ny,nx)){
				ret++;
				dp[ny][nx] = true;
				dfs(ny,nx);
			}
		}
	}

	boolean ok(int y, int x){
		return y>= 0 && x>=0 && y<h && x<w && board[y].charAt(x)=='.' && !dp[y][x];
	}
}
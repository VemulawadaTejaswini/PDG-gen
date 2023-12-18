import java.util.*; 
 
public class Main
{
	public static void main(String args[]) throws Exception{
		new Main().run();
	}
	

	int w,h;
	
	public void run()
	{
		int i,j,k,l;
		Scanner cin=new Scanner(System.in);
		while(true){
			//ツ陳シツ進ツ　ツ右ツ静慊　ツ板スツ転	 ツ債カツ静慊　ツ津「ツ止
			w = cin.nextInt();
			h = cin.nextInt();
			if(w==0 && h ==0) break;
			int board[][] = new int[h][w];
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					board[i][j] = cin.nextInt();
				}
			}
			int[] cost = new int[4];
			int MAXCOST = 99999999;
			int[][][] dp = new int[h][w][4];
			boolean[][][] flag = new boolean[h][w][4];
			flag[0][0][0] = true;
			for(i=0;i<4;i++) cost[i] = cin.nextInt();
			int vx[] = {1,0,-1,0};
			int vy[] = {0,1,0,-1};
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					for(k=0;k<4;k++){
						dp[i][j][k] = MAXCOST;
					}
				}
			}
			dp[0][0][0] = 0;
			while(true){
				boolean loopflag = false;
				for(i=0;i<h;i++){
					for(j=0;j<w;j++){
						for(k=0;k<4;k++){
							if(!flag[i][j][k]) continue;
							for(l=0;l<4;l++){
								int addcost = cost[l];
								int nextk = k;
								if(board[i][j] == l) addcost = 0;
								nextk = (k + l)%4;
								int nexty = i + vy[nextk];
								int nextx = j + vx[nextk];
								if(ok(nexty,nextx)){
									if(dp[nexty][nextx][nextk] > dp[i][j][k] + addcost){
										dp[nexty][nextx][nextk] = dp[i][j][k] + addcost;
										loopflag = flag[nexty][nextx][nextk] = true;
									}
								}
							}
						}
					}
				}
				if(!loopflag) break;
			}
			int res = MAXCOST; 
			for(k=0;k<4;k++) res = Math.min(res, dp[h-1][w-1][k]);
			System.out.println(res);
		}
	}
	
	boolean ok(int y, int x){
		return x>=0 && y>=0 && x<w && y<h;
	}
	
}
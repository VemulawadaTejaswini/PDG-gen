import java.util.*;
import static java.lang.Math.*;

public class Main {

	int[][] sea;
	int[][] land;
	static final int INF = 1<<28;
	int N, R;
	int[] tar;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			int M = in.nextInt();
			if(N==0) return ;
			sea = new int[N][N];
			land = new int[N][N];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					sea[i][j] = land[i][j] = INF;
				}
			}
			for(int i=0; i<M; i++){
				int x = in.nextInt()-1,
					y = in.nextInt()-1,
					t = in.nextInt();
				String wh = in.next();
				if(wh.equals("S")){
					sea[x][y] = min(sea[x][y], t);
					sea[y][x] = sea[x][y];
				}
				else{
					land[x][y] = min(land[x][y], t);
					land[y][x] = land[x][y];
				}
			}
			R = in.nextInt();
			tar = new int[R];
			for(int i=0; i<R; i++){
				tar[i] = in.nextInt() - 1;
			}
			System.out.println(solve());
		}
	}

	int solve(){
		for(int i=0; i<N; i++){
			sea[i][i] = land[i][i] = 0;
		}
		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					sea[i][j] = min(sea[i][j], sea[i][k]+sea[k][j]);
					land[i][j] = min(land[i][j], land[i][k]+land[k][j]);
				}
			}
		}
		int[][] dp = new int[R][N];
		for(int i=0; i<R; i++){
			for(int j=0; j<N; j++){
				dp[i][j] = INF;
			}
		}
		for(int i=0; i<N; i++){
			dp[0][i] = min(dp[0][i], sea[0][i] + land[i][tar[0]]);
		}
		for(int k=0; k<R-1; k++){
			for(int i=0; i<N; i++)if(dp[k][i] != INF){
				for(int j=0; j<N; j++){
					dp[k+1][j] = min(dp[k+1][j], dp[k][i]+land[tar[k]][i]+sea[i][j]+land[j][tar[k+1]]);
				}
				dp[k+1][i] = min(dp[k+1][i], dp[k][i] + land[tar[k]][tar[k+1]]);
			}
		}
		int ret = INF;
		for(int i=0; i<N; i++){
			ret = min(ret, dp[R-1][i]);
		}
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}
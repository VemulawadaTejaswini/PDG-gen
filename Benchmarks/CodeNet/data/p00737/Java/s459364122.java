import java.util.*;

public class Main {

	static final int INF = 1<<29;
	static final int[] dy = {0,1,0,-1};
	static final int[] dx = {1,0,-1,0};

	int W, H;
	int[][] board;
	int[] cost;
	
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			W = in.nextInt(); H = in.nextInt();
			if(W==0) return ;
			board = new int[H][W];
			cost = new int[4];
			for(int i=0; i<H; i++)for(int j=0; j<W; j++){
				board[i][j] = in.nextInt();
			}
			for(int i=0; i<4; i++)
				cost[i] = in.nextInt();
			System.out.println(solve());
		}
	}

	class State{
		int dist,y,x,dir;
		State(int _d, int _y, int _x, int _dir){
			this.dist  = _d;
			this.y = _y;
			this.x = _x;
			this.dir = _dir;
		}
	}

	class Cmp implements Comparator<State>{
		public int compare(State a, State b){
			return a.dist>b.dist?1:a.dist<b.dist?-1:0;
		}
	}

	int solve(){
		int[][][] dist = new int[H][W][4];
		for(int i=0; i<H; i++)for(int j=0; j<W; j++)for(int k=0; k<4; k++){
			dist[i][j][k] = INF;
		}
		PriorityQueue<State> Q = new PriorityQueue<State>(11,new Cmp());
		Q.add(new State(0,0,0,0));
		while(!Q.isEmpty()){
			State tp = Q.poll();
			if(tp.y == H-1 && tp.x == W-1) return tp.dist;
			if(dist[tp.y][tp.x][tp.dir] != INF) continue;
			dist[tp.y][tp.x][tp.dir] = tp.dist;
			for(int k=0; k<4; k++){
				int ndir = (tp.dir + k)%4;
				int ny = tp.y + dy[ndir], nx = tp.x + dx[ndir];
				if(0<=ny && ny<H && 0<=nx && nx<W && dist[ny][nx][ndir] == INF){
					int ndist = tp.dist + (board[tp.y][tp.x]==k?0:cost[k]);
					Q.add(new State(ndist, ny, nx, ndir) );
				}
			}
		}
		
		return -1;
	}

	public static void main(String args[]){
		new Main().run();
	}
}
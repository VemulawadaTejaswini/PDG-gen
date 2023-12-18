import java.util.*;

public class Main {

	class Point{
		int y, x;
		Point(int _y, int _x){
			this.y = _y;
			this.x = _x;
		}
	}

	class Gravity{
		double x, weight;
		Gravity(double _x, double _w){
			this.x = _x;
			this.weight = _w;
		}
		Gravity add(Gravity a){
			double nw = this.weight + a.weight;
			double nx = (this.x * this.weight + a.x * a.weight)/nw;
			return new Gravity(nx,nw);
		}
	}

	char[][] tmpboard;
	int[][] board;
	int[] dy = {-1,0,0,1};
	int[] dx = {0,1,-1,0};
	double EPS = 1e-7;
	Point[] over;
	Gravity tG;
	int MAX_P = 600;
	int W, H;
	int L, R;
	int Lcnt, Rcnt, Wcnt;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			W = in.nextInt(); H = in.nextInt();
			if(W==0 && H==0) return ;
			tmpboard = new char[H][];
			for(int i=0; i<H; i++){
				tmpboard[i] = in.next().toCharArray();
			}
			System.out.println(solve()?"STABLE":"UNSTABLE");
		}
	}

	void dfs(int y, int x, int c){
		if(board[y][x] != c) return ;
		if(y==H-1 || board[y+1][x] == -1 ||  (board[y+1][x] > 0 && board[y+1][x] != c)){
			L = Math.min(L, x);
			R = Math.max(R, x+1);
		}
		board[y][x] = -2;
		tG = tG.add(new Gravity(x+0.5, 1));
		for(int k=0; k<4; k++){
			int ny = y + dy[k],
				nx = x + dx[k];
			if(0<=ny && ny<H && 0<=nx && nx<W){
				if(k == 0 && board[ny][nx] > 0 && board[ny][nx] != c){
					over[board[ny][nx]] = new Point(ny,nx);
				}
				else if(board[ny][nx] == c){
					dfs(ny,nx,c);
				}
			}
		}
	}

	Gravity rec(int y, int x){
		over = new Point[MAX_P];
		tG = new Gravity(0,0);
		L = Integer.MAX_VALUE; R = Integer.MIN_VALUE;
		dfs(y,x,board[y][x]);
		dfs2(y,x,-2,-1);
		Gravity myG = new Gravity(tG.x, tG.weight);
		Point[] tmp = over.clone();
		int left = L, right = R;
		for(int i=1; i<MAX_P; i++){
			if(tmp[i] != null){
				Gravity result = rec(tmp[i].y, tmp[i].x);
				if(result == null) return null;
				myG = myG.add(result);
			}
		}
		if(left + EPS <= myG.x && myG.x <= right - EPS){
			return myG;
		}
		else{
			return null;
		}
	}

	boolean solve(){
		init();
		for(int i=0; i<W; i++)if(board[H-1][i] != 0){
			return rec(H-1,i) != null;
		}
		return false;
	}

	void dfs2(int y, int x, int cur, int to){
		board[y][x] = to;
		for(int k=0; k<4; k++){
			int ny = y + dy[k],
				nx = x + dx[k];
			if(0<=ny && ny<H && 0<=nx && nx<W && board[ny][nx] == cur){
				dfs2(ny,nx,cur,to);
			}
		}
	}

	void init(){
		board = new int[H][W];
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++)if(tmpboard[i][j] != '.'){
				board[i][j] = (int)tmpboard[i][j] + 100000;
			}
		}
		int cnt = 1;
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++)if(board[i][j] >= 100000){
				dfs2(i,j,board[i][j],cnt);
				cnt++;
			}
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}
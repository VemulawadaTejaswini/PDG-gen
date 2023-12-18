import java.util.*;

public class Main {

	int[][] graph;
	int W, H;
	static final int[] dx = {0,0,-1,1};
	static final int[] dy = {1,-1,0,0};

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			W = in.nextInt();
			H = in.nextInt();
			if(W==0 && H==0) return ;
			graph = new int[H][W];
			for(int i=0; i<H; i++){
				for(int j=0; j<W-1; j++){
					int a = in.nextInt();
					if(a == 0){
						graph[i][j] |= 1<<3;
						graph[i][j+1] |= 1<<2;
					}
				}
				if(i<H-1){
					for(int j=0; j<W; j++){
						int a = in.nextInt();
						if(a==0){
							graph[i][j] |= 1<<0;
							graph[i+1][j] |= 1<<1;
						}
					}
				}
			}
			System.out.println(solve());
		}
	}

	class Pair{
		int y, x, dist;
		Pair(int _y, int _x, int _d){
			this.y = _y;
			this.x = _x;
			this.dist = _d;
		}
	}

	int solve(){
		Queue<Pair> Q = new LinkedList<Pair>();
		Q.add(new Pair(0,0,1));
		boolean[][] visited = new boolean[H][W];
		visited[0][0] = true;
		while(!Q.isEmpty()){
			Pair tp = Q.poll();
			if(tp.x == W-1 && tp.y == H-1) return tp.dist;
			for(int k=0; k<4; k++){
				if(((graph[tp.y][tp.x] >> k)&1) == 1 && !visited[tp.y + dy[k]][tp.x + dx[k]]){
					visited[tp.y + dy[k]][tp.x + dx[k]] = true;
					Q.add(new Pair(tp.y + dy[k], tp.x + dx[k], tp.dist+1));
				}
			}
		}
		return 0;
	}

	public static void main(String args[]){
		new Main().run();
	}
}
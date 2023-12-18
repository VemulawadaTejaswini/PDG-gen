import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int INF = 1 << 24;
	int [] vx = {0,1,0,-1};
	int [] vy = {-1,0,1,0};
	
	class State implements Comparable<State>{
		int x,y,dir,cost;

		public State(int x, int y,int dir, int cost) {
			this.x = x;
			this.y = y;
			this.dir = dir;
			this.cost = cost;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return "State [x=" + x + ", y=" + y + ", dir=" + dir + ", cost="
					+ cost + "]";
		}
		
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0) break;
			int [][] data = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [] costT = new int[4];
			for(int i = 0; i < 4; i++){
				costT[i] = sc.nextInt();
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(0, 0, 1, 0));
			int [][][] close = new int[h][w][4];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w;j++){
					Arrays.fill(close[i][j], INF);
				}
			}
			close[0][0][1] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.x == w - 1 && now.y == h - 1){
					ans = now.cost;
					break;
				}
				
				int sign = data[now.y][now.x];
				for(int i = 0; i < 4; i++){
					int ndir = (now.dir + i) % 4;
					int xx = now.x + vx[ndir];
					int yy = now.y + vy[ndir];
					if(isOK(xx,yy, w,h)){
						int nextcost = now.cost;
						if(sign != i){
							nextcost += costT[i];
						}
						if(close[yy][xx][ndir] <= nextcost) continue;
						open.add(new State(xx, yy, ndir, nextcost));
						close[yy][xx][ndir] = nextcost;
					}
					
				}
			}
			System.out.println(ans);
		}
		
	}
	private boolean isOK(int xx, int yy, int w, int h) {
		return (0 <= xx && xx < w && 0 <= yy && yy < h);
	}
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
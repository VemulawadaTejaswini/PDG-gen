import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	char [][] data;
	int w,h;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	class State implements Comparable<State>{
		int nowx,nowy, cost;

		public State(int nowx, int nowy, int cost) {
			this.nowx = nowx;
			this.nowy = nowy;
			this.cost = cost;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return "State [nowx=" + nowx + ", nowy=" + nowy + ", cost=" + cost
					+ "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			data = new char[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				String s = sc.next();
				data[i] = s.toCharArray();
				int res = s.indexOf('&');
				if(res >= 0){
					sy = i;
					sx = res;
				}
			}
			int res = solve(sx,sy);
			System.out.println(res);
		}
	}

	private int solve(int sx, int sy) {
		int INF = 1 << 24;
		PriorityQueue<State> open = new PriorityQueue<State>();
		open.add(new State(sx, sy, 0));
		int[][] close = new int[h][w];
		for(int i = 0; i < h; i++){
			Arrays.fill(close[i], INF);
		}
		close[sy][sx] = 0;
		int ans = INF;
		while(! open.isEmpty()){
			State now = open.poll();
			if(isGoal(now)){
				ans = now.cost;
				break;
			}
			for(int i = 0; i < 4; i++){
				int xx = now.nowx + vx[i];
				int yy = now.nowy + vy[i];
				int nextcost = now.cost;
				if(data[now.nowy][now.nowx] != '#' && data[yy][xx] == '#'){
					nextcost++;
				}
				if(close[yy][xx] <= nextcost) continue;
				open.add(new State(xx, yy, nextcost));
				close[yy][xx] = nextcost;
			}
		}
		return ans;
	}

	private boolean isGoal(State now) {
		if(now.nowx == 0 || now.nowy == 0 || now.nowx == w-1 || now.nowy == h-1) return true;
		return false;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}
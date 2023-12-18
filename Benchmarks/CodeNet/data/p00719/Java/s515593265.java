import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int INF = 1 << 24;
	
	class State implements Comparable<State>{
		int pos, bit;
		double cost;

		public State(int pos, double cost, int bit) {
			this.pos = pos;
			this.cost = cost;
			this.bit = bit;
		}

		@Override
		public int compareTo(State o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int tick = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g = sc.nextInt();
			if((tick|n|m|s|g) == 0) break;
			s--;
			g--;
			int [] data = new int[tick];
			for(int i = 0; i < tick; i++){
				data[i] = sc.nextInt();
			}
			int [][] pass = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < m; i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int dis = sc.nextInt();
				pass[from][to] = dis;
				pass[to][from] = dis;
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(s, 0, 0));
			double  [][] close = new double[n][1 << tick];
			for(int i = 0; i < n; i++){
				Arrays.fill(close[i], INF);
			}
			close[s][0] = 0.0;
			double ans = INF;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.pos == g){
					ans = now.cost;
					break;
				}
				
				for(int i = 0; i < n; i++){
					if(pass[now.pos][i] == INF) continue;
					for(int j = 0; j < tick; j++){
						if((now.bit & (1 << j)) == 0){
							int nextB = now.bit | (1 << j);
							double nextcost = now.cost + (double)pass[now.pos][i] / data[j];
							
							if(close[i][nextB] <= nextcost) continue;
							close[i][nextB] = nextcost;
							open.add(new State(i, nextcost, nextB));
						}
					}
				}
			}
			if(ans == INF){
				System.out.println("Impossible");
			}
			else{
				System.out.printf("%.3f\n", ans);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
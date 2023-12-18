import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);


	class State implements Comparable<State>{
		int now,cost, tick;

		public State(int now, int cost, int tick) {
			this.now = now;
			this.cost = cost;
			this.tick = tick;
		}

		@Override
		public int compareTo(State arg0) {
			return this.cost - arg0.cost;
		}
		
	}

	private void doit(){
		while(true){
			int c = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			if((c|n|m|s|d) == 0) break;
			s--;
			d--;
			int [][] pass = new int[n][n];
			int INF = 1 << 24;
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < n; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int cost = sc.nextInt();
				pass[a][b] = cost;
				pass[b][a] = cost;
			}
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(s, 0,c));
			int [][] close = new int[n][c+1];
			for(int i = 0; i < n; i++){
				Arrays.fill(close[i], INF);
			}
			close[s][c] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == d){
					ans = now.cost;
					break;
				}
				for(int i = 0; i < n; i++){
					if(pass[now.now][i] == INF) continue;
					int nextcost = now.cost + pass[now.now][i];
					if(close[i][now.tick] > nextcost){
						open.add(new State(i, nextcost, now.tick));
						close[i][now.tick] = nextcost;
					}
					if(now.tick != 0){
						nextcost = now.cost + pass[now.now][i] / 2;
						if(close[i][now.tick - 1] > nextcost){
							open.add(new State(i, nextcost, now.tick - 1));
							close[i][now.tick-1] = nextcost;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}
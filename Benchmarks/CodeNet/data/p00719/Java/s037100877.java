import java.util.*;
public class Main {
	//0350 start
	//0413 end
	int INF = 1 << 24;

	class State implements Comparable<State>{
		int now, tick;
		double cost;
		public State(int now, int tick, double cost) {
			this.now = now;
			this.tick = tick;
			this.cost = cost;
		}
		@Override
		public int compareTo(State o) {
			if(this.cost < o.cost)return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
		@Override
		public String toString() {
			return "State [now=" + now + ", tick=" + tick + ", cost=" + cost
					+ "]";
		}


	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((n|m|p|a|b) == 0)break;
			a--;
			b--;
			int [] t = new int[n];
			for(int i = 0; i < n; i++){
				t[i] = sc.nextInt();
			}
			int [][] pass = new int[m][m];
			for(int i = 0; i < m; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < p; i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int dis = sc.nextInt();
				pass[from][to] = dis;
				pass[to][from] = dis;
			}
			PriorityQueue<State> open = new PriorityQueue<State>();
			open.add(new State(a, (1 << n) - 1, 0.0));
			double [][]close = new double[m][(1 << n)];
			for(int i = 0; i < m; i++){
				if(a == i) continue;
				Arrays.fill(close[i], INF);
			}

			double ans = INF;
			while(! open.isEmpty()){
				State now = open.poll();
				//System.out.println(now);
				if(now.now == b){
					ans = now.cost;
					break;
				}

				for(int i = 0; i < m; i++){
					if(pass[now.now][i] == INF){
						continue;
					}
					//System.out.println("i = " + i);
					for(int j = 0; j < n; j++){
						if((now.tick & (1 << j)) == 0) continue;
						int nexttick = (now.tick ^ (1 << j));
						double value = (double)pass[now.now][i] / t[j];
						double nextcost = now.cost + value;
						//System.out.println("c = " + close[i][nexttick]);
						if(close[i][nexttick] <= nextcost) continue;
						//System.out.println("nexttick = " + nexttick + " " + now.tick + " " + j);
						open.add(new State(i, nexttick, nextcost));
						close[i][nexttick] = nextcost;
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

	public static void main(String [] args){
		new Main().doit();
	}
}
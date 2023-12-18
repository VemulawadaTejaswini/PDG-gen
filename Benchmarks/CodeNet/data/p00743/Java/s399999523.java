import java.util.*;

public class Main {
	final int INF = 1 << 24;
	int [] xdis = {0,1,0,-1};
	int [] ydis = {1,0,-1,0};
	class C implements Comparable<C>{
		int v,town,lasttown;
		double time;
		public C(int v, int town, int lasttown, double time) {
			this.v = v;	this.town = town;this.lasttown = lasttown;this.time = time;
		}
		@Override
		public int compareTo(C o) {
			if(time < o.time) return -1;
			if(time > o.time) return 1;
			return 0;
		}
	}
	
	private double getT(int dis, int v){
		double res = (double) dis / v;
		return res;
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			int s = sc.nextInt();
			int g = sc.nextInt();
			int [][] pass = new int[n+1][n+1];
			int [][] maxs = new int[n+1][n+1];
			for(int i=1; i <= n; i++){
				Arrays.fill(pass[i], INF);
				Arrays.fill(maxs[i], INF);
			}
			for(int i=0; i < m; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int d = sc.nextInt();
				int c = sc.nextInt();
				pass[x][y] = d; pass[y][x] = d;
				maxs[x][y] = c; maxs[y][x] = c;
			}
			PriorityQueue<C> open = new PriorityQueue<C>();
			open.add(new C(1,s,-1,0.0));
			double [][][] close = new double[n+1][n+1][31];
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){
					Arrays.fill(close[i][j], INF);
				}
			}
			close[0][0][0] = 0.0;
			double ans = INF;
			while(! open.isEmpty()){
				C now = open.poll();
				
				for(int speed = -1; speed <= 1; speed++){
					int v = now.v + speed;
					if(now.lasttown == -1 && v != 1) continue;
					if(! (0 < v && v < 31)) continue;
					for(int i = 1; i <= n; i++){
						if(pass[now.town][i] == INF) continue;
						if(i == now.lasttown) continue;
						if(maxs[now.town][i] < v) continue;
						int dis = pass[now.town][i];
						double nexttime = now.time + getT(dis,v);
						if(close[now.town][i][v] <= nexttime) continue;
						if(i == g && v == 1){
							ans = Math.min(ans, nexttime);
							continue;
						}
						open.add(new C(v, i, now.town, nexttime));
						close[now.town][i][v] = nexttime;
					}
				}
			}
			
			//System.out.print("ANS=");
			if(ans == INF){
				System.out.println("unreachable");
				continue;
			}
			System.out.printf("%1.5f\n",ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
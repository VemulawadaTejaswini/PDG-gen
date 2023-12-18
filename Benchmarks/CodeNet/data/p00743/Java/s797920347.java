
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 30;
	double EPS = 1e-5;
	int n, m;
	int s, g;
	int map[][];
	int lim[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			s = sc.nextInt()-1;
			g = sc.nextInt()-1;
			map = new int[n][n];
			lim = new int[n][n];
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int d = sc.nextInt();
				int l = sc.nextInt();
				map[a][b] = map[b][a] = d;
				lim[a][b] = lim[b][a] = l;
			}
			System.out.println(dijkstra());
		}
	}
	int dv[] = {-1,0,1};
	String dijkstra() {
		double t[][][] = new double[n][n+1][MAX+1];
		for(double[][] a:t ) for(double[] b:  a) fill(b, INF);
		t[s][n][0] = 0;
		PriorityQueue<Pair> que = new PriorityQueue<Pair>(1, new MyComp());
		Pair now = new Pair(s, -1, 1, 0, 0);
		que.add(now);
		for(;!que.isEmpty();) {
			now = que.remove();
//			debug(que);
//			debug(now.p, now.past_p, now.v, now.t);
			if( now.p == g && now.past_v == 1 ) return String.valueOf(now.t);
			if( 0 == now.v ) continue;
			for(int i=0;i<n;i++) {
				if( map[now.p][i] == 0 || now.p == i || now.past_p == i) continue;
				if( now.v > lim[now.p][i] ) continue;
				double time = now.t + (double)map[now.p][i] / now.v;
//				debug(now.p, i, map[now.p][i]*1.0/now.v);
				if(time < t[i][now.p][now.v]) {
					for(int j=0;j<3;j++) {
						if( now.v + dv[j] >= 0 ) {					
							que.add(new Pair(i, now.p, now.v+dv[j], now.v, time));
//							debug(i, now.p, now.v+dv[j], time);
						}
					}
					t[i][now.p][now.v] = time;
				}
			}
		}
		return "unreachable";
	}
	
	class Pair {
		int p, v, past_p, past_v;
		double t;
		Pair(int p, int past_p, int v, int past_v, double t) {
			this.p = p;
			this.v = v;
			this.t = t;
			this.past_p = past_p;
			this.past_v = past_v;
		}
	}
	
	class MyComp implements Comparator<Pair> {

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO 自動生成されたメソッド・スタブ
			if(o1.t > o2.t ) return 1;
			else if(o1.t < o2.t) return -1;
			return o1.v - o2.v;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}
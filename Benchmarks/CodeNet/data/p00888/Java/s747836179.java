import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P implements Comparable<P> {
		double x;
		int y;

		P(double x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(P t) {
			return (this.x - t.x) > 0 ? 1 : -1;
		}
	}

	class S implements Comparable<S> {
		int s;
		int e;
		double cost;

		S(int s, int e, double cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		}

		public int compareTo(S t) {
			return (cost - t.cost) > 0 ? 1 : -1;
		}

	}

	void run() {
		int x[] = new int[100];
		int y[] = new int[100];
		boolean[] map = new boolean[1001];
		P[] p = new P[100*1000];

		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
	
			Arrays.fill(map,false);

			int index = 0;
			for (int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				map[y[i]] = true;
				p[index] = new P(x[i],y[i]);
				index++;
			}

			for (int h = 0; h < 1001; h++) {
				if (map[h]) {
					for (int i = 0; i < N - 1; i++) {
						if ((y[i + 1] - h) * (h - y[i]) > 0) {
							double r = ((double) h - y[i]) / (y[i + 1] - y[i]);
							double x2 = (x[i + 1] - x[i]) * r + x[i];

							
							p[index] = new P(x2, h);
							index++;
						}
					}
				}
			}

			int n = index;
			for(int i = n ; i < p.length;i++){
				p[i] = new P(Double.MAX_VALUE,-1);
			}
			Arrays.sort(p);

			double cost[][] = new double[n][n];
			for(int i = 0; i < n;i++){
				Arrays.fill(cost[i], Double.MAX_VALUE);
			}
			PriorityQueue<S> q = new PriorityQueue<S>();
			q.add(new S(0, n - 1, 0));

			double answer = Double.MAX_VALUE;
			for (;;) {
				if (q.isEmpty()) {
					break;
				}

				S s = q.poll();

				
				if (s.cost > cost[s.s][s.e]) {
					continue;
				}
				cost[s.s][s.e] = s.cost;
				if(s.s == s.e){
					answer = Math.min(s.cost,answer);
					continue;
				}
//				System.out.println(s.s+" "+s.e);
				
				for (int i = -1; i < 2; i++) {
					for (int j = -1; j < 2; j++) {
						if ((i | j) == 0) {
							continue;
						}

						if (s.s + i < 0) {
							continue;
						}
						if (s.e + j > n - 1) {
							continue;
						}
						if( s.s+i > n-1){
							continue;
						}
						if(s.e+j < 0){
							continue;
						}
						if(p[s.s+i].y == p[s.e+j].y){
//							System.out.println("here");
							double dc = 0;
							dc += ( p[s.s+i].x - p[s.s].x )*( p[s.s+i].x - p[s.s].x );
							dc += ( p[s.s+i].y - p[s.s].y )*( p[s.s+i].y - p[s.s].y );
							dc = Math.sqrt(dc);

							double dd = 0;
							dd += ( p[s.e+j].x - p[s.e].x )*( p[s.e+j].x - p[s.e].x );
							dd += ( p[s.e+j].y - p[s.e].y )*( p[s.e+j].y - p[s.e].y );
							dd = Math.sqrt(dd);

							if(cost[s.s+i][s.e+j] > dc+dd+s.cost){
//								System.out.println("abs");
								cost[s.s+i][s.e+j] = dc+dd+s.cost;
								q.add(new S(s.s+i,s.e+j,dc+dd+s.cost));
							}
						}
					}
				}
			}
			System.out.println(answer);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
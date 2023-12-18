
import java.awt.Point;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class D{
		int x, y, v;
		D(int x, int y, int v) {
			this.x = x;
			this.y = y;
			this.v = v;
		}
	}
	
	class Node implements Comparable<Node> {
		double d;
		int p;
		int id;

		public int compareTo(Node tar) {
			return (Math.abs(d - tar.d) < 1.e-8) ? 0 : (d-tar.d < 0) ? -1 : 1;
		}

		Node(double d, int p, int id) {
			this.d = d;
			this.p = p;
			this.id = id;
		}
	}

	double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	public void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n+m == 0) {
				break;
			}
			D[] s = new D[n];
			Point[] c = new Point[m];
			for(int i=0; i<n; i++) {
				s[i] = new D(sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			for(int i=0; i<m; i++) {
				c[i] = new Point(sc.nextInt(),sc.nextInt());
			}
			
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			double memo[] = new double[m];
			Arrays.fill(memo, Double.MAX_VALUE);
			for(int i=0; i<m; i++) {
				int min = 0;
				double mind = Double.MAX_VALUE/4;
				for(int j=0; j<n; j++) {
					double t = dist(c[i].x, c[i].y, s[j].x, s[j].y) / s[j].v;
					if(t < mind) {
						min = j;
						mind = t;
					}
				}
				q.add(new Node(mind, i, min));
				memo[i] = mind;
			}
			boolean used[] = new boolean[m];
			int cnt = 0;
			
			for(; !q.isEmpty(); ) {
				Node cur = q.poll();
				if(used[cur.p])
					continue;
				used[cur.p]= true;
				cnt++;
				if(cnt == m) {
					System.out.println(cur.d);
					break;
				}
				for(int i=0; i<m; i++) {
					if(used[i])
						continue;
					double nd = cur.d + dist(c[cur.p].x, c[cur.p].y, c[i].x, c[i].y) / s[cur.id].v;
					if(nd < memo[i]) {
						memo[i] = nd;
						q.add(new Node(nd, i, cur.id));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}
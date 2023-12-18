
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();

		E[] G = new E[n];
		for(int i=0;i<n;i++) G[i] = new E();

		for(int i=0;i<m;i++) {
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1, l = sc.nextInt();
			G[a].add(new V(b, 2*l));
			G[b].add(new V(a, 2*l));
		}

		int[] sp = new int[k];
		int[] dist = new int[n]; fill(dist, INF);

		PriorityQueue<S> que = new PriorityQueue<S>();
		int max = 0;

		for(int i=0;i<k;i++) {
			sp[i] = sc.nextInt() - 1;
			dist[sp[i]] = 0;

			for(V v: G[sp[i]]) if(dist[v.t] > v.l){
				que.add(new S(v.t, v.l));
			}
		}

		for(;!que.isEmpty();) {
			S cur = que.remove();
			if(dist[cur.p] == INF) {
				dist[cur.p] = cur.c;
				max = max(max, cur.c);
			} else {
				max = max(max, ( dist[cur.p] + cur.c ) / 2);
				continue;
			}

			for(V v: G[cur.p]) if(dist[v.t] > v.l){
				que.add(new S(v.t, cur.c + v.l));
			}
		}

		System.out.println((max+1) / 2);
	}

	class S implements Comparable<S>{
		int p, c;
		S(int p, int c){
			this.p = p;
			this.c = c;
		}

		public int compareTo(S arg0) {
			// TODO Auto-generated method stub
			return c - arg0.c;
		}
	}

	class V {
		int t, l;
		V(int t, int l) {
			this.t = t; this.l = l;
		}
	}

	class E extends ArrayList<V> {}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
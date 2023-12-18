
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int n;
	int[] cost, to;
	boolean[] visited;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cost = new int[n];
		for (int i=0;i<n;i++) cost[i] = sc.nextInt();
		to = new int[n]; fill(to, -2);
		
		System.out.println(solve());
//		debug(to);
	}
	
	int solve() {
		visited = new boolean[n]; visited[0] = true;
		LinkedList<P> q = new LinkedList<P>();
		q.add(new P(0, 0));
		for (;;) {
			P cur = q.removeFirst();
			if (cur.p >= n-1) return cur.c;
			for (int i=1;i<=6;i++) {
				int next = next(cur.p + i);
				if (next < 0 || visited[next]) continue;
				visited[next] = true;
				q.add(new P(next, cur.c+1));
			}
		}
	}
	
	int next(int p) {
		if (p >= n-1) return n-1;
		if (to[p] >= -1) return to[p];
		
		ArrayList<Integer> ps = new ArrayList<Integer>();
		visited = new boolean[n];
		
		while (cost[p] != 0) {
			if (visited[p]) break;
			visited[p] = true;
			p += cost[p];
			ps.add(p);
		}
		
		if (visited[p]) p = -1;
		else to[p] = p;
		
		for (int i : ps) {
			to[i] = p;
		}
		
		return p;
	}
	
	class P {
		int p, c;
		P(int p, int c) {
			this.p = p;
			this.c = c;
		}
	}
	

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
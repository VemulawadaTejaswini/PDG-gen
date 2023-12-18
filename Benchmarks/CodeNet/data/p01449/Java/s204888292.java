
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
		
		for (int i=0;i<n;i++) {
			visited = new boolean[n];
			jump(i);
		}
		System.out.println(solve());
	}
	
	int solve() {
		LinkedList<P> q = new LinkedList<P>();
		visited = new boolean[n];
		q.add(new P(0, 0));
		visited[0] = true;
		for (;;) {
			P cur = q.removeFirst();
			if (cur.p == n-1) return cur.c;
			
			for (int i=1;i<=6;i++) {
				if (cur.p + i >= n-1) return cur.c+1;
				if (to[cur.p+i] < 0) continue;
				if (! visited[to[cur.p+i]]) {
					visited[to[cur.p+i]] = true;
					q.add(new P(to[cur.p+i], cur.c+1));
				}
			}
		}
		
	}
	
	class P {
		int p, c;
		P(int p, int c) {
			this.p = p;
			this.c = c;
		}
	}
	
	int jump(int p) {
		if (to[p] >= -1) return to[p];
		if (visited[p]) return to[p] = -1;
		visited[p] = true;
		int next = p + cost[p];
		if (cost[next] == 0) return to[p] = next;
		return to[p] = jump(next);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
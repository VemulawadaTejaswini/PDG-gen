import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	HashMap<Integer, Integer> mp;
	int getId(int num) {
		if (mp.containsKey(num)) {
			return mp.get(num);
		}
		int v = mp.size();
		mp.put(num, v);
		return v;
	}
	static final int INF = 1001001001;
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			mp = new HashMap<Integer,Integer>();
			
			int[][] g = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(g[i], INF);
				g[i][i] = 0;
			}
			for (int i = 0; i < n; i++) {
				int here = getId(sc.nextInt());
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					int there = getId(sc.nextInt());
					g[here][there] = 1;
				}
			}
			
			for (int k = 0; k < n; k++) for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
			
			int Q = sc.nextInt();
			for (int q = 0; q < Q; q++) {
				int s = getId(sc.nextInt());
				int t = getId(sc.nextInt());
				int ttl = sc.nextInt();
				
				int d = g[s][t];
				if (d + 1 > ttl) {
					System.out.println("NA");
				} else {
					System.out.println(d + 1);
				}
			}
		}
	}
}


import java.util.Scanner;

public class Main {

	private static Scanner in;

	private static int[] id;
	private static int n, m;
	
	private static int[] size;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		
		
		id = new int[n];
		size = new int[n];
		
		for(int i=0; i<n; i++) {
			id[i] = i;
			size[i] = 1;
		}
		
		for(int i = 0; i<m; i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
			
			if (connected(u, v)) {
				continue;
			}
			
			union(u, v);
		}
		int ans = 0;
		
		
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, size[i]);
		}
		
		System.out.println(ans);
	}

	
	private static int root(int u) {
		while(u!=id[u]) {
			id[u] = id[id[u]];
			u = id[u];
		}
		return u;
	}
	
	private static boolean connected(int u, int v) {
		return root(u)==root(v);
	}
	
	private static void union(int u, int v) {
		int p = root(u);
		int q = root(v);
		id[p] = q;
		size[q] += size[p];
	}
}

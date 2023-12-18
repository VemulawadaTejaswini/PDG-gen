import java.util.*;
public class Main {
	static boolean[] s = new boolean[100001];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] c = new boolean[n][n];

		for ( int i=0; i<m; i++ ) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			c[a][b] = true;
			c[b][a] = true;
		}

		int k = 0;
		for ( int i=0; i<n; i++ ) {
			if ( !s[i] ) {
				dfs(c, i, n);
				k++;
			}
		}

		System.out.println(k-1);
	}

	private static void dfs(boolean[][] edges, int vertex, int sz) {
		s[vertex] = true;
		for ( int i=0; i<sz; i++ ) {
			if ( edges[vertex][i] && !s[i] ) dfs(edges, i, sz);
		}
	}
}
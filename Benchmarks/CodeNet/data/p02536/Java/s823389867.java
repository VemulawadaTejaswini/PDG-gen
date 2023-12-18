import java.util.*;
public class Main {
	static boolean[] s = new boolean[100001];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, LinkedList<Integer>> c = new HashMap<Integer, LinkedList<Integer>>();
		for ( int i=0; i<n; i++ ) {
			LinkedList<Integer> ll = new LinkedList<Integer>();
			c.put(i, ll);
		}

		for ( int i=0; i<m; i++ ) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			c.get(a).add(b);
			c.get(b).add(a);
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

	private static void dfs(HashMap<Integer, LinkedList<Integer>> c, int vertex, int sz) {
		s[vertex] = true;
		for ( int i=0; i<sz; i++ ) {
			if ( c.get(vertex).contains(i) && !s[i] ) dfs(c, i, sz);
		}
	}
}
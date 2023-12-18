import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static final Scanner IN = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		new Main().run();
	}
	
	private static final int MAX_N = 100000;
	private static final int MAX_Q = 100000;
	
	private int n;
	private int q;
	
	private final int[] p = new int[MAX_N - 1];
	private final boolean[] isQuery = new boolean[MAX_Q];
	private final int[] v = new int[MAX_Q];
	
	private final int[] marked = new int[MAX_N];
	private final int[] value = new int[MAX_N];
	
	private void run() {
		
		while(((n = IN.nextInt()) | (q = IN.nextInt())) != 0) {
			
			for (int i = 0; i < n - 1; i ++) {
				
				p[i] = IN.nextInt() - 1;
			}
			Arrays.fill(marked, 0, n, - 1);
			marked[0] = q;
			for (int i = 0; i < q; i ++) {
				
				isQuery[i] = IN.next().charAt(0) == 'Q';
				v[i] = IN.nextInt() - 1;
				if(!isQuery[i] && marked[v[i]] < 0) {
					
					marked[v[i]] = i;
				}
			}
			
			initialize();
			for (int i = 0; i < n; i ++) if (marked[i] < 0) union(i, p[i - 1]);
			
			long summation = 0;
			for (int i = q - 1; i >= 0; i --) {
				
				if (isQuery[i]) {
					
					summation += value[find(v[i])];
					
				} else if (marked[v[i]] == i) {
					
					union(v[i], p[v[i] - 1]);
				}
			}
			System.out.println(summation);
		}
	}
	
	private final int[] parent = new int[MAX_N];
	private final int[] rank = new int[MAX_N];
	
	private void initialize() {
		
		for (int i = 0; i < n; i ++) {
			
			parent[i] = i;
			rank[i] = 0;
			value[i] = i + 1;
		}
	}
	
	private int find(int x) {
		
		if (parent[x] != x) parent[x] = find(parent[x]);
		return parent[x];
	}
	
	private void union(int x, int y) {
		
		x = find(x);
		y = find(y);
		if (x == y) {
			
			return;
		}
		
		if (rank[x] < rank[y]) {
			
			parent[x] = y;
			
		} else {
			
			parent[y] = x;
			value[x] = value[y];
			
			if (rank[x] == rank[y]) {
				
				rank[x] ++;
			}
		}
	}
}
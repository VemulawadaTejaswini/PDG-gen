import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
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
	
	private final int[] parent = new int[MAX_N];
	
	private void run() {
		
		while(((n = IN.nextInt()) | (q = IN.nextInt())) != 0) {
			
			parent[0] = 0;
			for (int i = 0; i < n - 1; i ++) {
				
				p[i] = parent[i + 1] = IN.nextInt() - 1;
			}
			for (int i = 0; i < q; i ++) {
				
				if (IN.next().charAt(0) == 'Q') {
					
					isQuery[i] = true;
				}
				v[i] = IN.nextInt() - 1;
				if (!isQuery[i]) {
					
					parent[v[i]] = v[i];
				}
			}
			
			initialize();
			
			int summation = 0;
			for (int i = q - 1; i >= 0; i --) {
				
				if (isQuery[i]) {
					
					summation += find(v[i]) + 1;
					
				} else {
					
					union(v[i], p[v[i]]);
				}
			}
			System.out.println(summation);
		}
	}
	
	private static final Scanner IN = new Scanner(System.in);
	
	private final int[] rank = new int[MAX_N];
	
	private void initialize() {
		
		Arrays.fill(rank, 0);
		for (int i = 0; i < n; i ++) {
			
			initialize(i, 0);
		}
	}
	
	private void initialize(int i, int r) {
		
		if (i == parent[i]) {
			
			return;
		}
		
		i = parent[i];
		r ++;
		if (rank[i] < r) {
			
			rank[i] = r;
			initialize(i,r);
		}
	}
	
	private int find(int x) {
		
		if (parent[x] == x) {
			
			return x;
			
		} else {
			
			return parent[x] = find(parent[x]);
		}
	}
	
	private void union(int x, int y) {
		
		y = find(y);
		
		if (rank[x] < rank[y]) {
			
			parent[x] = y;
			
		} else {
			
			parent[y] = x;
			
			if (rank[x] == rank[y]) {
				
				rank[x] ++;
			}
		}
	}
}
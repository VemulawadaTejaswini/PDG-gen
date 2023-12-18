import java.util.*;

 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int parent[] = new int[n + 1];
		int size[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			union(parent, size, x, y);
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, size[i]);
		}
		System.out.println(ans);
	}
	
	static void union(int parent[], int size[], int i, int j) {
		int root1 = root(parent, i);
		int root2 = root(parent, j);
		if (root1 == root2) return;
		
		if (size[root1] > size[root2]) {
			size[root1] += size[root2];
			parent[root2] = root1;
		}
		else {
			size[root2] += size[root1];
			parent[root1] = root2;
		}
	}
	
	static int root(int parent[], int i) {
		while (parent[i] != i) {
			i = parent[i];
		}
		
		return i;
	}
}
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int m = Integer.parseInt(in.next());
		int x = Integer.parseInt(in.next()) - 1;
		int y = Integer.parseInt(in.next()) - 1;
		int xx = Integer.parseInt(in.next()) - 1;
		int yy = Integer.parseInt(in.next()) - 1;
		char[][] grid = new char[n][m];
		int[][] seen = new int[n][m];
		List<Node> queue = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String cur = in.next();
			grid[i] = cur.toCharArray();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				seen[i][j] = -1;
			}
		}
		if(grid[x][y] != '#') {
			dfs(grid, seen, queue, x, y, n, m, 0);
		}
		int cnt = 0; 
		while(cnt < queue.size()) {
			int a = queue.get(cnt).x;
			int b = queue.get(cnt).y;
			int load = queue.get(cnt).time;
			for(int i = Math.max(0, a - 2); i <= Math.min(n - 1, a + 2); i++) {
				for(int j = Math.max(0, b - 2); j <= Math.min(m - 1, b + 2); j++) {
					if(grid[i][j] == '#') continue;
					if(seen[i][j] != -1) continue;
					else {
						dfs(grid, seen, queue, i, j, n, m, load + 1);
					}
				}
			}
			cnt += 1;
		}
		System.out.println(seen[xx][yy]);
	}
	public static void dfs(char[][] grid, int[][] seen, List<Node> queue, int i, int j, int n, int m, int load) {
		seen[i][j] = load;
		queue.add(new Node(i, j, load));
		int[] a = {1, -1, 0, 0};
		int[] b = {0, 0, 1, -1};
		for(int k = 0; k < 4; k++) {
			int x = i + a[k];
			int y = j + b[k];
			if((x < 0) || (x >= n)) continue;
			if((y < 0) || (y >= m)) continue;
			if(seen[x][y] != -1) continue;
			if(grid[x][y] == '#') continue;
			dfs(grid, seen, queue, x, y, n, m, load);
		}
	}
}
class Node {
	int x;
	int y;
	int time;
	public Node(int x, int y, int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}
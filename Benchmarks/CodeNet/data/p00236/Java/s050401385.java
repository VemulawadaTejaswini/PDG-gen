import java.util.*;

class Main {
	public static void main(String[] z) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int w = s.nextInt(), h = s.nextInt();
			if (w < 1) {
				break;
			}
			int[][] a = new int[h + 2][w + 2];
			adj = new ArrayList<List<Integer>>();
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					a[i][j] = 1 - s.nextInt();
					adj.add(new ArrayList<Integer>());
				}
			}
			Set<Integer> vx = new HashSet<Integer>();
			int start = 0, end = 0;
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					for (int[] d : new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 },
							{ 0, -1 } }) {
						if (a[i][j] == 1 && a[i + d[0]][j + d[1]] == 1) {
							int u = i * w + j - w - 1;
							int v = (i + d[0]) * w + j + d[1] - w - 1;
							vx.add(u);
							adj.get(u).add(v);
							start = u;
							end = v;
						}
					}
				}
			}
			List<Integer>hamilton = new ArrayList<Integer>();
			hamilton.add(start);
			hamilton.add(end);
			Arrays.fill(used, false);
			used[start]=used[end] = true;
			for (int i = 0; i < hamilton.size() - 1; ++i) {
				start = i + 1;
				Arrays.fill(pathused, false);
				if (isH(hamilton.get(i + 1), hamilton.get(i + 1),
						hamilton.get(i))) {
					while (path.size() > 0) {
						Integer p = path.pop();
						hamilton.add(i + 1, p);
						used[p] = true;
					}
				}
			}
			System.out.println(hamilton.size() == vx.size() ? "Yes" : "No");
		}
	}

	static List<List<Integer>> adj;
	static Deque<Integer> path = new ArrayDeque<Integer>();
	static boolean[] used = new boolean[50], pathused = new boolean[50];
	
	static boolean isH(int start, int u, int v) {
		for (int next : adj.get(u)) {
			if (next == v && u != start) {
				return true;
			}

			if (!used[next] && !path.contains(next)) {
				path.push(next);
				pathused[next] = true;
				if (isH(start, next, v)) {
					return true;
				}
				path.pop();
				pathused[next] = false;
			}
		}
		return false;
	}
}
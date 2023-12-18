import java.io.*;
import java.util.*;

public class Main {

	static TreeSet<Integer> rows[], cols[];

	static int n, m, K;

	static int INF = (int) 1e9;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		m = sc.nextInt();
		K = sc.nextInt();
		rows = new TreeSet[n];
		cols = new TreeSet[m];

		for (int i = 0; i < n; i++) {
			rows[i] = new TreeSet();

		}
		for (int i = 0; i < m; i++) {
			cols[i] = new TreeSet();

		}
		int sI = sc.nextInt() - 1, sJ = sc.nextInt() - 1;
		Queue<int[]> q = new LinkedList();
		q.add(new int[] { sI, sJ });
		int endI = sc.nextInt() - 1, endJ = sc.nextInt() - 1;
		int[][] dist = new int[n][m];
		char[][] grid = new char[n][m];
		for (int i = 0; i < n; i++) {
			grid[i] = sc.next().toCharArray();
			for (int j = 0; j < m; j++)

				if (i == sI && j == sJ)
					dist[i][j] = 0;
				else {
					dist[i][j] = -1;
					rows[i].add(j);
					cols[j].add(i);

				}

		}

		while (!q.isEmpty()) {
			Integer nxt;
			int[] curr = q.poll();
			int i = curr[0], j = curr[1], d = dist[i][j];
			// right;
			while (true) {

				nxt = rows[i].higher(j);
				if (nxt != null && nxt - j <= K && grid[i][nxt]=='.') {
					dist[i][nxt] = d + 1;
					cols[nxt].remove(i);
					rows[i].remove(nxt);
					q.add(new int[] { i, nxt });
				} else
					break;
			}
			// left
			while (true) {

				nxt = rows[i].lower(j);
				if (nxt != null && Math.abs(nxt - j) <= K && grid[i][nxt]=='.') {
					dist[i][nxt] = d + 1;
					cols[nxt].remove(i);
					rows[i].remove(nxt);
					q.add(new int[] { i, nxt });
				} else
					break;
			}

			// down
			while (true) {

				nxt = cols[j].higher(i);
				if (nxt != null && Math.abs(nxt - i) <= K && grid[nxt][j]=='.')  {
					dist[nxt][j] = d + 1;
					cols[j].remove(nxt);
					rows[nxt].remove(j);
					q.add(new int[] { nxt, j });
				} else
					break;
			}
			// left
			while (true) {

				nxt = cols[j].lower(i);
				if (nxt != null && Math.abs(nxt - i) <= K && grid[nxt][j]=='.') {
					dist[nxt][j] = d + 1;
					cols[j].remove(nxt);
					rows[nxt].remove(j);
					q.add(new int[] { nxt, j });
				} else
					break;

			}
		}
		System.out.println(dist[endI][endJ]);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}
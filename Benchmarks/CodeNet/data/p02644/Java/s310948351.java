import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static final int INF = (int) 1e9;
	static int n, m, k, dist[][];
	static char[][] adj;
	static int[] dx = {1,-1,0,0} , dy = {0,0,1,-1};
	
	static boolean valid(int r, int c) {
		return r >= 0 && r < n && c >= 0 && c < m && adj[r][c] != '@';
	}
	
	static void bfs(int x, int y) {
		dist[x][y] = 0;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x, y, 0));
		
		while(!q.isEmpty()) {
			int r = q.peek().r, c = q.peek().c;
			if(q.poll().d > dist[r][c]) continue;
			
			for(int i = 0; i < 4; i++) {
				for(int j = 1; j <= k; j++) {
					int nr = dx[i] * j + r, nc = dy[i] * j + c;
					if(!valid(nr, nc) || dist[nr][nc] < dist[r][c] + 1) break;
					q.add(new Pair(nr, nc, dist[nr][nc] = dist[r][c] + 1));
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		int x1 = sc.nextInt() - 1, y1 = sc.nextInt() - 1;
		int x2 = sc.nextInt() - 1, y2 = sc.nextInt() - 1;
		
		dist = new int[n][m];
		adj = new char[n][];
		for(int i = 0; i < n; i++) {
			adj[i] = sc.nextLine().toCharArray();
			Arrays.fill(dist[i], INF);
		}
		
		bfs(x1,y1);
		out.println(dist[x2][y2] == INF ? -1 : dist[x2][y2]);
		out.close();
	}

}

class Pair{
	int r, c, d;
	public Pair(int r, int c, int d) {
		this.r = r;
		this.c = c;
		this.d = d;
	}
}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public Scanner(String file) throws Exception {
		br = new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	
	static int[] di = {0, 0, 1, -1};
	static int[] dj = {1, -1, 0, 0};
	
	static int N;
	static boolean[][] left;
	static int[][] dist;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		left = new boolean[N][N];
		dist = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				dist[i][j] = Math.min(Math.min(i, N - 1 - i), Math.min(j, N - 1 - j));
			}
		}
		
		int ans = 0;
		for (int idx = 0; idx < N * N; idx++) {
			int tmp = sc.nextInt() - 1;
			int iPos = tmp / N;
			int jPos = tmp % N;
			
			ans += dist[iPos][jPos];
			left[iPos][jPos] = true;
			Deque<Integer> queue = new ArrayDeque<>();
			queue.addLast(iPos * N + jPos);
			while (!queue.isEmpty()) {
				Integer val = queue.pollFirst();
				int ii = val / N;
				int jj = val % N;
				for (int k = 0; k < 4; k++) {
					int ni = ii + di[k];
					int nj = jj + dj[k];
					int nDist = dist[ii][jj] + (left[ii][jj] ? 0 : 1);
					if (0 <= ni && ni < N && 0 <= nj && nj < N && nDist < dist[ni][nj]) {
						dist[ni][nj] = nDist;
						if (left[ii][jj]) {
							queue.addFirst(ni * N + nj);
						} else {
							queue.addLast(ni * N + nj);
						}
					}
				}
			}
			
		}
		
		out.println(ans);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}

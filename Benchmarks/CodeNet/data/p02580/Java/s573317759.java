import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int h = f.nextInt(), w = f.nextInt(), m = f.nextInt();
		int[] row = new int[h], col = new int[w];
		boolean[][] bomb = new boolean[h][w];
		while(m-- > 0) {
			int i = f.nextInt() - 1, j = f.nextInt() - 1;
			row[i]++;
			col[j]++;
			bomb[i][j] = true;
		}

		int max = 0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				max = Math.max(max, row[i] + col[j] + (bomb[i][j] ? -1 : 0));
			}
		}

		out.println(max);
		out.close();
	}


	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
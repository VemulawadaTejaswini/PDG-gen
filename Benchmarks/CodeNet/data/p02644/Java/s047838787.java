import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int x1 = Integer.parseInt(sa[0]) - 1;
		int y1 = Integer.parseInt(sa[1]) - 1;
		int x2 = Integer.parseInt(sa[2]) - 1;
		int y2 = Integer.parseInt(sa[3]) - 1;
		char[][] arr = new char[h][w];
		int[][] dp = new int[h][w];
		int count = 0;
		for (int i = 0; i < h; i++) {
			String s = br.readLine();
			for (int j = 0; j < w; j++) {
				arr[i][j] = s.charAt(j);
				if (arr[i][j] == '.') {
					count++;
				}
			}
		}
		br.close();
		int[] q = new int[count];
		q[0] = x1*w+y1;
		dp[x1][y1] = 1;
		int current = 0;
		int size = 1;
		while (current < size) {
			int x = q[current++];
			int a = x/w;
			int b = x%w;
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= k; j++) {
					if (a+j*dx[i] < 0 || a+j*dx[i] >= h || b+j*dy[i] < 0 || b+j*dy[i] >= w || arr[a+j*dx[i]][b+j*dy[i]] == '@' || dp[a][b]+1 >= dp[a+j*dx[i]][b+j*dy[i]]) {
						break;
					}
					if (dp[a+j*dx[i]][b+j*dy[i]] == 0) {
						dp[a+j*dx[i]][b+j*dy[i]] = dp[a][b]+1;
						q[size++] = (w*(a+j*dx[i])+b+j*dy[i]);
					}
				}
			}
		}
		System.out.println(dp[x2][y2]-1);
	}
	
	public static PrintWriter out;
	
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}

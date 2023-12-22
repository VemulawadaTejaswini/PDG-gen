import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		boolean flag = true;
		int i=0; 
		int tPrev = 0;
		int xPrev = 0;
		int yPrev = 0;
		while (i < n) {
			int curT = fr.nextInt();
			int curX = fr.nextInt();
			int curY = fr.nextInt();
			int timeDiff = curT - tPrev;
			int manhattanDist = Math.abs(curX - xPrev) + Math.abs(curY - yPrev);
			if ((manhattanDist > timeDiff) || (timeDiff - manhattanDist)%2 == 1) {
				flag = false;
			}
			xPrev = curX;
			yPrev = curY;
			tPrev = curT;
			i++;
		}
		System.out.println(flag ? "Yes" : "No");
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}

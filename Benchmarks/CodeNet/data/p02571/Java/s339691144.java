import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		solve();
		out.close();
	}

	static void solve() {
		String s = f.next(), t = f.next();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<s.length()-t.length()+1;i++) {
			int cnt = 0;
			for(int j=0;j<t.length();j++) {
				if(s.charAt(i+j) != t.charAt(j)) {
					cnt++;
				}
			}
			min = Math.min(cnt, min);
		}

		out.println(min);
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
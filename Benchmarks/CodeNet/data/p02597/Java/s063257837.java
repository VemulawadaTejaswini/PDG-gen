
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		String input = in.nextLine();
		input = input.substring(0, input.lastIndexOf("R") + 1);
		char[] s = input.toCharArray();
		
		int rnum = 0;
		for(char i : s) if(i == 'R') rnum++;
		
		int ans = 0;
		for(int i = 0; i < rnum; i++)
		{
			if(s[i] == 'W') ans++;
		}
		
		System.out.println(ans);
		
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}




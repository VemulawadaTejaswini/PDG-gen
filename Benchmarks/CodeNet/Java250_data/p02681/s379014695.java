import java.io.*;
import java.util.*;

public class Main {

	static long m = (long) (1e9 + 7);

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int T = scn.nextInt(), tcs = 0;
//		A: while (tcs++ < T) {
//			int n = scn.nextInt();
//
//		}
//		System.out.println(sb);
		String s = scn.next(), t = scn.next();
		System.out.println(s.equals(t.substring(0, t.length() - 1)) ? "Yes" : "No");
	}

	static class Scanner {

		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
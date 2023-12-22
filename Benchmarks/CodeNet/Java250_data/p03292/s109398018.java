import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{

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

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int d1=Math.abs(b-a),d2=Math.min(Math.abs(b-a),Math.abs(c-a)),d3=Math.abs(c-b);
		int d4=Math.min(Math.abs(a-b), Math.abs(c-b)),d5=Math.abs(a-c);
		int d6=Math.min(Math.abs(a-c), Math.abs(b-c)),d7=Math.abs(a-b);
		System.out.println(Math.min(d2+d3, Math.min(d4+d5, d6+d7)));
	}
}
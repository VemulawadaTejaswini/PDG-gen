import java.io.*;
import java.util.*;

public class Main {
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		// (n-1) *L -(n-1) + 2+3+4+..+n
		int n=sc.nextInt(), L=sc.nextInt();
		int g0 = (n)*L-(n)+n*(n+1)/2;
		int g1 = (n - 1)*L-(n - 1)+n*(n+1)/2;
		int diff = g0 - g1;
		if(diff >= 0) {
			out.println(g1 - 1);
		} else {
			out.println(g1 + Math.max(-n, diff));
		}
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

}
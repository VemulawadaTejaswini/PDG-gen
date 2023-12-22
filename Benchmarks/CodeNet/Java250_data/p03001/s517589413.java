import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.StringTokenizer;

public class Main {
	
	public static double area(long W, long H, long x, long y) {
		final long total = W * H;
		
		final double dx = (double)(y) / x;

		final double upper = (double)(x * y) / 2;
		final double middle = (H - y) * x;
		
		final double nx = Math.min(W - x, (H - y) * dx);
		final double ry = (H - y) - Math.min(H - y, nx / dx);
		
		final double lower = ((H - y) - (ry)) * nx / 2.0;
		
		final double area = upper + middle + lower;
		return Math.min(area, total - area);
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final long W = sc.nextLong();
			final long H = sc.nextLong();
			final long x = sc.nextLong();
			final long y = sc.nextLong();
			
			System.out.printf("%.10f %d\n", W * H / 2.0, (W == x * 2 && H == y * 2) ? 1 : 0);
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}
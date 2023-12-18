import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[][] twn=new int[H][W];
		int sum=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				twn[i][j]=sc.nextInt();
			}
		}
		int max=1000000007;
		int[][] road=new int[H][W];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				int tmp=0;
				for(int k=0; k<H; k++) {
					for(int l=0; l<W; l++) {
						tmp+=Math.min(Math.abs(i-k),Math.abs(l-j))*twn[k][l];
					}
				}
				max=Math.min(max, tmp);
			}
		}
		pl(max);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}

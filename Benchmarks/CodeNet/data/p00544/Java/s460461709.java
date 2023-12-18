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
		int[][] flag=new int[H][W];
		int[][] wbr=new int[3][H+1];	//累積和
		for(int i=0; i<H; i++) {
			String s=sc.next();
			for(int j=0; j<W; j++) {
				if(s.charAt(j)=='W') {
					flag[i][j]=0;
				}
				else if(s.charAt(j)=='B') {
					flag[i][j]=1;
				}
				else if(s.charAt(j)=='R') {
					flag[i][j]=2;
				}
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<=H; j++) {
				wbr[i][j]=0;
			}
		}
		for(int h=0; h<3; h++) {
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					if(flag[i][j]!=h) {
						wbr[h][i+1]++;
					}
				}
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=1; j<=H; j++) {
				wbr[i][j]=wbr[i][j]+wbr[i][j-1];
			}
		}
		int min=H*W*2;

		for(int i=1; i<H; i++) {
			for(int j=1; j<H; j++) {
				if(i<j) {
					int sum=wbr[0][i]-wbr[0][0]+wbr[1][j]-wbr[1][i]+wbr[2][H]-wbr[2][j];
					min=Math.min(min, sum);
				}
			}
		}
		pl(min);
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int D=sc.nextInt();
		int[][] za=new int[N][M];
		for(int i=0; i<N; i++) {
			String s=sc.next();
			for(int j=0; j<M; j++) {
				if(s.charAt(j)=='.') {
					za[i][j]=0;
				}
				else{
					za[i][j]=1;
				}
			}
		}
		int ok=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M-D+1; j++) {
				for(int k=j; k<D+j; k++) {
					if(za[i][k]==1) {
						break;
					}
					else if(za[i][k]==0 && k==D+j-1) {
						ok++;
					}
				}
			}
		}
		for(int i=0; i<N-D+1; i++) {
			for(int j=0; j<M; j++) {
				for(int k=i; k<D+i; k++) {
					if(za[k][j]==1) {
						break;
					}
					else if(za[k][j]==0 && k==D+i-1) {
						ok++;
					}
				}
			}
		}
		pl(ok);
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}

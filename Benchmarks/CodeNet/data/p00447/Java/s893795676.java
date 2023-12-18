import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	static int[] zahyo;
	static int[] zahyoN;
	static int N;
	static int M;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		while(true) {
			M=sc.nextInt();
			if(M==0) {
				System.exit(0);
			}
			zahyo=new int[M*2];
			for(int i=0; i<M; i++) {
				zahyo[i*2]=sc.nextInt();
				zahyo[i*2+1]=sc.nextInt();
			}
			N=sc.nextInt();
			zahyoN=new int[N*2];
			for(int i=0; i<N; i++) {
				zahyoN[i*2]=sc.nextInt();
				zahyoN[i*2+1]=sc.nextInt();
			}
			for(int i=0; i<N; i++) {
				int xz=zahyo[0]-zahyoN[2*i];
				int yz=zahyo[1]-zahyoN[2*i+1];
				if(check(xz,yz)) {
					break;
				}
				else {
					//
				}
			}
		}
	}
	static boolean check(int xz,int yz) {
		for(int h=0; h<M; h++) {
			for(int i=0; i<N; i++) {
				if(zahyo[h*2]-xz==zahyoN[i*2] && zahyo[h*2+1]-yz==zahyoN[i*2+1]) {
					break;
				}
				else if(i==N-1 &&  !(zahyo[h*2]-xz==zahyoN[i*2] && zahyo[h*2+1]-yz==zahyoN[i*2+1])) {
					return false;
				}
			}
		}
		pl((-xz)+" "+(-yz));
		return true;
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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int[] num=new int[N];
		for(int i=0; i<N-1; i++) {
			num[i]=sc.nextInt();
		}
		int ans=sc.nextInt();
		long[][] dp=new long[N][21];
		for(int i=0; i<N; i++) {
			for(int j=0; j<=20; j++) {
				dp[i][j]=0;
			}
		}
		dp[0][0]=1;
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<=20; j++) {
				if(dp[i][j]>0) {		//少なくとも1つは答えがあるとき
					if(j-num[i]>=0) {
						dp[i+1][j-num[i]]+=dp[i][j];	//引き算をするとき
					}
					if(j+num[i]<=20) {
						dp[i+1][j+num[i]]+=dp[i][j];	//引き算をするとき
					}
				}
			}
		}
		pl(dp[N-1][ans]);
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

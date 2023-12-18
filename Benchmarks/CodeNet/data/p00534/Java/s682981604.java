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
		int M=sc.nextInt();
		int[] dist=new int[N];
		int[] cond=new int[M];
		for(int i=0; i<N; i++) {
			dist[i]=sc.nextInt();
		}
		for(int i=0; i<M; i++) {
			cond[i]=sc.nextInt();
		}
		int[][] dp=new int[M+1][N+1];
		int INF=1000000007;
		for(int i=0; i<=M; i++) {
			for(int j=0; j<=N; j++) {
				dp[i][j]=INF;
			}
		}
		dp[0][0]=0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(dp[i][j]<INF) {		//何らかの方法が確定している時
					dp[i+1][j]=Math.min(dp[i][j], dp[i+1][j]);	//STAY~
					dp[i+1][j+1]=Math.min(dp[i+1][j+1], Math.min(dp[i][j]+dist[j]*cond[i],dp[i][j+1]));
				}
			}
		}
		/*for(int i=0; i<=M; i++) {
			for(int j=0; j<=N; j++) {
				p(dp[i][j]+" ");
			}
			pl();
		}*/
		int min=INF;
		for(int i=0; i<=M; i++) {
			min=Math.min(min, dp[i][N]);
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

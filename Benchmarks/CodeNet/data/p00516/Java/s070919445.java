import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] cost=new int[N];
		int[] vote=new int[N];
		Arrays.fill(cost, 0);
		Arrays.fill(vote, 0);
		for(int i=0; i<N; i++) {
			cost[i]=sc.nextInt();
		}
		for(int i=0; i<M; i++) {
			int b=sc.nextInt();
			for(int j=0; j<N; j++) {
				if(b>=cost[j]) {
					vote[j]++;
					break;
				}
			}
		}
		int maxindex=0;
		int maxnum=0;
		for(int i=0; i<N; i++) {
			if(maxnum<vote[i]) {
				maxnum=vote[i];
				maxindex=i;
			}
		}
		pl(maxindex+1);
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int N=sc.nextInt();
			if(N==0) {
				System.exit(0);
			}
			HashMap<String,String> unko=new HashMap<String,String>();
			for(int i=0; i<N; i++) {
				String moto=sc.next();
				String ato=sc.next();
				unko.put(moto, ato);
			}
			StringBuilder sb=new StringBuilder();
			int K=sc.nextInt();
			for(int i=0; i<K; i++) {
				String tmp=sc.next();
				if(unko.containsKey(tmp)) {
					sb.append(unko.get(tmp));
				}
				else {
					sb.append(tmp);
				}
			}
			pl(sb.toString());
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

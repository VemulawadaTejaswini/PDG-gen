import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	static int ans_sum=0;
	static int ko=0;
	static int sum=0;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		while(true){
			ko=sc.nextInt();
			sum=sc.nextInt();
			if(ko==0 && sum==0) {
				//pl(0);
				break;
			}
			ans_sum=0;
			dfs(0,sum,sum);
			pl(ans_sum);
		}
	}
	public static void dfs(int kettei_num,int rest,int ika) {
		if(kettei_num==ko) {
			if(rest==0) {
				ans_sum++;
			}
			else {
				//
			}
		}
		if(rest<0) {
			return ;
		}
		else {
			for(int i=Math.min(ika,9); i>=0; i--) {
				dfs(kettei_num+1,rest-i,i-1);
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

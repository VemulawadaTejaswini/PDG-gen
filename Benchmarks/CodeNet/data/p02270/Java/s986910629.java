import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	static int[] ar;
	static int N,tracks;

	public static void main(String args[]){
		SC sc = new SC(System.in);
		N=sc.nextInt();
		tracks=sc.nextInt();
		ar=new int[N];
		for(int i=0; i<N; i++) {
			ar[i]=sc.nextInt();
		}
		int max=Integer.MAX_VALUE/10;
		int min=0;
		while(max-min>1) {
			int mid=(max+min)/2;
			if(bi(mid)) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		if(bi(min)) {
			pl(min);
		}
		else {
			pl(max);
		}

	}
	public static boolean bi(int mid) {
		int kaisu=0;
		int now=0;
		for(int i=0; i<N; i++) {
			if(now+ar[i]<=mid) {
				now+=ar[i];
			}
			else {
				kaisu++;
				if(ar[i]>mid) {
					return false;
				}
				else {
					now=ar[i];
				}
			}
		}
		if(now>0) {
			kaisu++;
		}
		if(kaisu<=tracks) {
			return true;
		}
		else {
			return false;
		}
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

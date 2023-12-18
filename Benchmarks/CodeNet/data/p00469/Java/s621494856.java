import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int[] sum=new int[10000];
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			if(N*K==0) {
				System.exit(0);
			}
			int[] cards=new int[N];
			for(int i=0; i<N; i++) {
				cards[i]=sc.nextInt();
			}
			int INF=1000000007;
			Arrays.fill(sum, INF);
			int counter=0;
			if(K==2) {
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						if(i!=j) {
							int a=Integer.parseInt(cards[i]+""+cards[j]);
							boolean find=findnum(a);
							if(find) {
								sum[counter]=a;
								counter++;
							}
						}
					}
				}
			}
			else if(K==3) {
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						for(int k=0; k<N; k++) {
							if(i!=j && j!=k && k!=i) {
								int a=Integer.parseInt(cards[i]+""+cards[j]+""+cards[k]);
								boolean find=findnum(a);
								if(find) {
									sum[counter]=a;
									counter++;
								}
							}
						}
					}
				}
			}
			else if(K==4) {
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						for(int k=0; k<N; k++) {
							for(int l=0; l<N; l++) {
								if(i!=j && j!=k && k!=l && i!=k && i!=l && j!=l) {
									int a=Integer.parseInt(cards[i]+""+cards[j]+""+cards[k]+""+cards[l]);
									boolean find=findnum(a);
									if(find) {
										sum[counter]=a;
										counter++;
									}
								}
							}
						}
					}
				}
			}
			pl(counter);
		}
	}
	public static boolean findnum(int a){
		for(int i=0; i<10000; i++) {
			if(sum[i]==a) {
				return false;
			}
		}
		return true;
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

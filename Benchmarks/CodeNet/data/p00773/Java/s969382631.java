

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main{
	static long ans=0;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int before=sc.nextInt();
			int after=sc.nextInt();
			int sum=sc.nextInt();
			if(before*after*sum==0) {
				break;
			}
			else {
				int min=(sum*100+(99+before))/(100+before);	//2つとも切り捨て無い時
				int kiri1=min+1;	//片方切り捨ての時
				int kiri2=min+2;	//どちらも切り捨ての時
				int[] dp1=new int[sum*3];
				int[] dp2=new int[sum*3];
				int[] dp3=new int[sum*3];
				Arrays.fill(dp1, 0);
				Arrays.fill(dp2, 0);
				Arrays.fill(dp3, 0);
				int max=0;

				for(int i=1; i<sum*3; i++) {
					if(i>0 && min-i>0) {
						if(i*(100+before)/100+(min-i)*(100+before)/100==sum) {		//消費税改定前の税抜きの値段にそれぞれに税を賦課した時に条件を満たすか
							dp1[i]=i*(100+after)/100+(min-i)*(100+after)/100;
							max=Math.max(max, dp1[i]);
						}
					}
				}

				for(int i=1; i<sum*3; i++) {
					if(i>0 && kiri1-i>0) {
						if(i*(100+before)/100+(kiri1-i)*(100+before)/100==sum) {		//消費税改定前の税抜きの値段にそれぞれに税を賦課した時に条件を満たすか
							dp2[i]=i*(100+after)/100+(kiri1-i)*(100+after)/100;
							max=Math.max(max, dp2[i]);
						}
					}
				}

				for(int i=1; i<sum*3; i++) {
					if(i>0 && kiri2-i>0) {
						if(i*(100+before)/100+(kiri2-i)*(100+before)/100==sum) {		//消費税改定前の税抜きの値段にそれぞれに税を賦課した時に条件を満たすか
							dp3[i]=i*(100+after)/100+(kiri2-i)*(100+after)/100;
							max=Math.max(max, dp3[i]);
						}
					}
				}
				pl(max);
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

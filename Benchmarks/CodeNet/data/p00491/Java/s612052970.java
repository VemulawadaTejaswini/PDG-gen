import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int MOD = 10000;

	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N = sc.nextInt();	//日数
		int K = sc.nextInt();	//制限の数
		int[] seigen=new int[101];
		Arrays.fill(seigen, 0);
		for(int i=0; i<K; i++) {
			int day=sc.nextInt();
			int mono=sc.nextInt();
			seigen[day]=mono;
		}
		int[][][] dp=new int[101][3][3];
		for(int i=0; i<=100; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					dp[i][j][k]=0;
				}
			}
		}
		if(seigen[1]==0 && seigen[2]==0) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					dp[2][j][k]=1;
				}
			}
		}
		else if(seigen[1]==0 && seigen[2]!=0) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					if(k==seigen[2]-1) {
						dp[2][j][k]=1;
					}
				}
			}
		}
		else if(seigen[1]!=0 && seigen[2]==0) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					if(j==seigen[1]-1) {
						dp[2][j][k]=1;
					}
				}
			}
		}
		else if(seigen[1]!=0 && seigen[2]!=0) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					if(j==seigen[1]-1 && k==seigen[2]-1) {
						dp[2][j][k]=1;
					}
				}
			}
		}

		for(int i=3; i<=100; i++) {
			if(seigen[i]==0) {//制限が無い時
				for(int a=0; a<3; a++) {
					for(int b=0; b<3; b++) {
						for(int c=0; c<3; c++) {
							if(a==b && b==c) {
								continue;
							}
							else {
								dp[i][b][c]+=dp[i-1][a][b];
							}
						}
					}
				}
			}
			else if(seigen[i]>0) {
				for(int a=0; a<3; a++) {
					for(int b=0; b<3; b++) {
						if(a==b && b==seigen[i]-1) {
							continue;
						}
						else {
							dp[i][b][seigen[i]-1]+=dp[i-1][a][b];
						}
					}
				}
			}
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					dp[i][j][k]%=MOD;
				}
			}
		}
		int sum=0;
		for(int i=0; i<3; i++) {
			for(int k=0; k<3; k++) {
				sum+=dp[N][i][k];
				sum%=MOD;
			}
		}
		pl(sum);
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

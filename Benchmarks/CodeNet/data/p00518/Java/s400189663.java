import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static int MOD=10007;
	static int[][] dp;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int days=sc.nextInt();
		dp=new int[days][8];
		String s=sc.next();
		for(int i=0; i<days; i++) {
			for(int j=0; j<8; j++) {
				dp[i][j]=0;
			}
		}
		/*
		 * 0 000
		 * 1 001 I
		 * 2 010 O
		 * 3 011 IO
		 * 4 100 J
		 * 5 101 JI
		 * 6 110 JO
		 * 7 111 JOI
		 */
		if(s.charAt(0)=='J') {
			dp[0][4]=1;
			dp[0][5]=1;
			dp[0][6]=1;
			dp[0][7]=1;
		}
		else if(s.charAt(0)=='O') {
			dp[0][6]=1;
			dp[0][7]=1;
		}
		else if(s.charAt(0)=='I') {
			dp[0][5]=1;
			dp[0][7]=1;
		}
		for(int i=1; i<days; i++) {
			if(s.charAt(i)=='J') {
				J(i);
			}
			else if(s.charAt(i)=='O') {
				O(i);
			}
			else if(s.charAt(i)=='I') {
				I(i);
			}
		}
		int sum=0;
		for(int i=0; i<8; i++) {
			sum+=dp[days-1][i];
		}
		pl(sum%MOD);
	}
	public static void J(int day) {
		for(int i=0; i<8; i++) {
			if(i>=4) {
				dp[day][4]+=dp[day-1][i];
			}
			if(i!=2) {
				dp[day][5]+=dp[day-1][i];
			}
			if(i!=1) {
				dp[day][6]+=dp[day-1][i];
			}
			dp[day][7]+=dp[day-1][i];
		}
		for(int i=0; i<8; i++) {
			dp[day][i]%=MOD;
		}
	}
	public static void O(int day) {
		for(int i=0; i<8; i++) {
			if(i!=1 && i!=4 && i!=5) {
				dp[day][2]+=dp[day-1][i];
			}
			if(i!=4) {
				dp[day][3]+=dp[day-1][i];
			}
			if(i!=1) {
				dp[day][6]+=dp[day-1][i];
			}
			dp[day][7]+=dp[day-1][i];
		}
		for(int i=0; i<8; i++) {
			dp[day][i]%=MOD;
		}
	}
	public static void I(int day) {
		for(int i=0; i<8; i++) {
			if(i%2==1) {
				dp[day][1]+=dp[day-1][i];
			}
			if(i!=4) {
				dp[day][3]+=dp[day-1][i];
			}
			if(i!=2) {
				dp[day][5]+=dp[day-1][i];
			}
			dp[day][7]+=dp[day-1][i];
		}
		for(int i=0; i<8; i++) {
			dp[day][i]%=MOD;
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


// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static long mod=998244353;
	static  HashSet<Integer> merged;

	public static void merge(int x,int y) {
		// merge a1 and a2
		
		
		for(int i=x;i<=y;i++) merged.add(i);
	}
	public static void main(String[] args) throws IOException {

		FastScanner sc = new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		merged=new HashSet<>();
		int a[][]=new int[k][2];
		
		
		
		for(int i=0;i<k;i++) {
			int x1=sc.nextInt(),y1=sc.nextInt();
			merge(x1, y1);
		}
		
		ArrayList<Integer> in=new ArrayList<>();
		in.addAll(merged);
		long dp[]=new long[n+1];
		dp[1]=1;
		for(int i=1;i<=n;i++) {
			for(int j:in) {
				if(i>j) dp[i]=(dp[i]+dp[i-j])%mod;
			}
		}
		out.println(dp[n]);
		
		
		out.close();
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
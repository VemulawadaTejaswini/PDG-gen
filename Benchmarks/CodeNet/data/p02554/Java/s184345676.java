import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		int MOD = 1000000007;
		
		// 計算
		long result = 1;
		for(int i = 0; i < n; i++){
		    result *= 10;
		    result %= MOD;
		}
		long a = 1;
		for(int i = 0; i < n; i++){
		    a *= 9;
		    a %= MOD;
		}
		long b = 1;
		for(int i = 0; i < n; i++){
		    b *= 8;
		    b %= MOD;
		}
		result -= a;
		result += MOD;
		result %= MOD;
		result -= a;
		result += MOD;
		result %= MOD;
		result += b;
		result %= MOD;
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}

}

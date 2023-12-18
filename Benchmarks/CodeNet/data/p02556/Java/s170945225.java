import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
		    x[i] = sc.nextInt();
		    y[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		long[] A = new long[n];
		long[] B = new long[n];
		for(int i = 0; i < n; i++){
		    A[i] = x[i] - y[i];
		    B[i] = x[i] + y[i];
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		result = max(A[n-1] - A[0], B[n-1] - B[0]);
		
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

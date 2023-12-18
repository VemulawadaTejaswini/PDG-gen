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
		long[] distA = new long[n];
		long[] distB = new long[n];
		for(int i = 0; i < n; i++){
		    distA[i] = abs(2 - x[i] - y[i]);
		    distB[i] = abs(1000000001 - x[i] + y[i]);
		}
		
		Arrays.sort(distA);
		Arrays.sort(distB);
		
		result = max(distA[n-1] - distA[0], distB[n-1] - distB[0]);
		
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

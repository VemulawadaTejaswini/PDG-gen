import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		int max = 100;
		
		long[] res = new long[n+1];
		for(int i = 1; i <= max; i++){
		    for(int j = 1; j <= max; j++){
		        for(int k = 1; k <= max; k++){
		            long tmp = i*i+j*j+k*k+i*j+j*k+k*i;
		            if(tmp < n+1) res[(int)tmp]++;
		        }
		    }
		}
		
		for(int i = 1; i <= n; i++){
		    System.out.println(res[i]);
		}
		

		// 出力
		//System.out.println(result);
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


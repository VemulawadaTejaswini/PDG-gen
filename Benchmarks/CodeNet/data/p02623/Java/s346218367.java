import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong();
		}
		long[] b = new long[m];
		for(int i = 0; i < m; i++){
		    b[i] = sc.nextLong();
		}

		// 計算
		long result = 0;
		long[] suma = new long[n+1];
		for(int i = 0; i < n; i++){
		    suma[i+1] = suma[i] + a[i];
		}
		long[] sumb = new long[m+1];
		for(int i = 0; i < m; i++){
		    sumb[i+1] = sumb[i] + b[i];
		}
		
		for(int i = 0; i < suma.length; i++){
		    long tmp = k - suma[i];
		    if(tmp < 0) continue;
		    int index = upperBound(sumb, tmp);
		    result = max(result, i+max(index-1, 0));
		}

		// 出力
		System.out.println(result);
	}

	static int upperBound(long[] array, long n){
		int index = 0;
		int l = -1;
		int r = array.length;
		while(r-l > 1){
			int c = (r + l)/2;
			
			if(n < array[c]){
				r = c;
			}else{
				l = c;
			}
		}
		index = r;
		return index;
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


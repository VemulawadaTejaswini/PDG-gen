import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		long result = 0;
		int[] cnt = new int[n+1];
		Arrays.fill(cnt, 1);
		cnt[0] = 0;
		for(int i = 2; i <= n; i++){
		    int j = i;
		    int c = 1;
		    while(j*c <= n){
		        cnt[j*c]++;
		        c++;
		    }
		}
		for(int i = 1; i <= n-1; i++){
		    result += cnt[i];
		}
		
		
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

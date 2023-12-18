import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		
		// 計算
		int result = 0;
		int abs = 1000;
		loop:
		for(int i = 0; i <= 1000; i++){
		    for(int j = 0; j < n; j++){
		        if(p[j] == i) continue loop;
		    }
		    if(abs > abs(x-i)){
		        result = i;
		        abs = abs(x-i);
		    }
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

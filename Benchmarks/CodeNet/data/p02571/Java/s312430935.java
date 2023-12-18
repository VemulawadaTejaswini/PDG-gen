import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		int result = 100000;
		for(int i = 0; i < s.length(); i++){
		    if(i+t.length() < s.length()) continue;
		    int tmp = 0;
		    for(int j = 0; j < t.length(); j++){
		        if(i+j >= s.length()){
		            tmp = 100000;
		            continue;
		        }
		        if(s.charAt(i+j) != t.charAt(j)) tmp++;
		    }
		    result = min(result, tmp);
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

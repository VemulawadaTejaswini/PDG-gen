import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String w = sc.next();
		
		// 計算
		String result = "Yes";
		char[] c = w.toCharArray();
		Arrays.sort(c);
		char now = ' ';
		int cnt = 0;
		for(int i = 0; i < c.length; i++){
		    if(now == c[i]){
		        cnt++;
		    }else{
		        if(cnt%2 == 1){
		            result = "No";
		            break;
		        }else{
		            cnt = 1;
		            now = c[i];
		        }
		    }
		}
		if(cnt%2 == 1) result = "No";
		
		
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


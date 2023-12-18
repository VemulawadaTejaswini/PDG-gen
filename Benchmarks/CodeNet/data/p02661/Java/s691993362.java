import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[][] ab = new long[n][2];
		for(int i = 0; i < n; i++){
		    ab[i][0] = sc.nextLong();
		    ab[i][1] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long from = 0;
		long to = 0;
		if(n%2 == 1){
		    Arrays.sort(ab, (s, t) -> Long.compare(s[0], t[0]));
		    //System.out.println(Arrays.deepToString(ab));
		    from = ab[n/2][0];
		    to = ab[n/2][1];
		}else{
		    Arrays.sort(ab, (s, t) -> Long.compare(s[0], t[0]));
		    //System.out.println(Arrays.deepToString(ab));
		    from = ab[n/2-1][0] + ab[n/2][0];
		    Arrays.sort(ab, (s, t) -> Long.compare(s[1], t[1]));
		    //System.out.println(Arrays.deepToString(ab));
		    to = ab[n/2-1][1] + ab[n/2][1] ;
		}
		result = to-from+1;
		
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

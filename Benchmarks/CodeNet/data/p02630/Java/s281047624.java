import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		HashMap<Long, Long> hm = new HashMap<Long, Long>();
		for(int i = 0; i < n; i++){
		    long a = sc.nextLong();
		    hm.put(a, hm.getOrDefault(a, 0L)+1);
		}
		long result = 0;
		for(Long key : hm.keySet()){
		    result += key*hm.get(key);
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
		    long b = sc.nextLong();
		    long c = sc.nextLong();
		    hm.put(c, hm.getOrDefault(c, 0L)+hm.getOrDefault(b, 0L));
		    result += (c-b)*hm.getOrDefault(b, 0L);
		    hm.remove(b);
		    System.out.println(result);
		}
		
		// 計算
		//long result = 0;
		
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

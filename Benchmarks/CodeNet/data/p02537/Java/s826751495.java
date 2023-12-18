import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int n;
    static int k;
    static int[] a;
    static int[] list;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		list = new int[n];
		for(int i = 0; i < n; i++){
		    dfs(i);
		}
		for(int i = 0; i < n; i++){
		    result = max(result, list[i]);
		}
		//System.out.println(Arrays.toString(list));
		
		// 出力
		System.out.println(result);
	}
	
	public static int dfs(int i){
	    if(list[i] > 0) return list[i];
	    for(int j = i+1; j < n; j++){
	        if(abs(a[i]-a[j]) <= k){
	            int tmp = dfs(j);
	            list[i] = tmp+1;
	            return list[i];
	        }
	    }
	    list[i] = 1;
	    return 1;
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

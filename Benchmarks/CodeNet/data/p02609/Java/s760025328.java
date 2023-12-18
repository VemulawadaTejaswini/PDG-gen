import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int[] list;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String x = sc.next();
		
		// 計算
		//int result = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(x.charAt(i) == '1') cnt++;
		}
		int mplus = 0;
		int tmp = 1;
		for(int i = 0; i < n; i++){
		    if(x.charAt(n-i-1) == '1'){
		        mplus += tmp%(cnt+1);
		        mplus %= cnt+1;
		    }
		    tmp *= 2;
		    tmp %= (cnt+1);
		}
		int mminus = 0;
		tmp = 1;
		for(int i = 0; i < n; i++){
		    if(cnt == 1) break;
		    if(x.charAt(n-i-1) == '1'){
		        mminus += tmp%(cnt-1);
		        mminus %= cnt-1;
		    }
		    tmp *= 2;
		    tmp %= (cnt-1);
		}
		int[] plus = new int[n+1];
		int[] minus = new int[n+1];
		tmp = 1;
		for(int i = 0; i < n; i++){
		    plus[n-i-1] = tmp%(cnt+1);
		    tmp *= 2;
		    tmp %= (cnt+1);
		}
		tmp = 1;
		for(int i = 0; i < n; i++){
		    if(cnt == 1) break;
		    minus[n-i-1] = tmp%(cnt-1);
		    tmp *= 2;
		    tmp %= (cnt-1);
		}

		list = new int[n+1];
		Arrays.fill(list, -1);
		list[0] = 0;
		list[1] = 1;
		for(int i = 0; i <= n; i++){
		    f(i);
		}
		
		for(int i = 0; i < n; i++){
		    int result = 0;
		    boolean flg = false;
		    if(x.charAt(i) == '1') flg = true;
		    
		    if(flg){
		        if(cnt != 1) result = list[(mminus-minus[i]+(cnt-1))%(cnt-1)] + 1;
		    }else{
		        result = list[(mplus+plus[i])%(cnt+1)] + 1;
		    }
		    System.out.println(result);
		}
		

		// 出力
		//System.out.println(result);
	}
	
	public static int f(int n) {
	    if(list[n] != -1) return list[n];
	    int m = Integer.bitCount(n);
	    list[n] = f(n%m)+1;
	    return list[n];
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


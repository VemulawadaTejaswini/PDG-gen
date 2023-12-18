import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 0; i < n+1; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		int[] upper = new int[n+1];
		int[] min = new int[n+1];
		for(int i = 0; i < n+1; i++){
		    if(i == 0){
		        upper[n-i] = a[n-i];
		        min[n-i] = a[n-i];
		    }else{
		        upper[n-i] = upper[n-i+1] + a[n-i];
		        min[n-i] = (min[n-i+1]+1)/2 + a[n-i];
		    }
		}
		for(int i = 0; i < n+1; i++){
		    if(i == 0){
		        if(min[i] > 1){
		            result = -1;
		            break;
		        }
		        upper[i] = 1;
		        result += upper[i];
		    }else{
		        upper[i] = min(upper[i], (upper[i-1]-a[i-1])*2);
		        result += upper[i];
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

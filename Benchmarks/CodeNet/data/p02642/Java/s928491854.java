import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		
		// 計算
		int result = 0;
		if(n == 1 && a[0] == 1){
		    System.out.println(1);
		    return;
		}
		if(n > 1 && a[0] == 1 && a[1] == 1){
		    System.out.println(0);
		    return;
		}
		
		if(n > 1 && a[0] == 1 && a[1] != 1){
		    System.out.println(1);
		    return;
		}
		
		int[] seive = new int[1000001];
		Arrays.fill(seive, -1);
		int[] check = new int[1000001];
		for(int i = 0; i < n; i++){
		    int p = a[i];
		    if(check[p] == 1){
		        result--;
		        check[p]++;
		        continue;
		    }
			if(seive[p] != -1) continue;
			seive[p] = p;
			result++;
			check[p]++;
			for(long j = p; j <= 1000000; j += p){
				if(seive[(int)j] == -1) seive[(int)j] = p; 
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

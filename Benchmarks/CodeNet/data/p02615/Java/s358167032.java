import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] list = new long[n];
		for(int i = 0; i < n; i++){
		    list[i] = sc.nextLong();
		}
		Arrays.sort(list);
		
		// 計算
		long result = 0;
		PriorityQueue<Num> q = new PriorityQueue<Num>((s, t) -> {
		    long sn = min(s.num1, s.num2);
		    long tn = min(t.num1, t.num2);
		    return Long.compare(tn, sn);
		});
		for(int i = n-1; i >= 0; i--){
		    long a = list[i];
		    Num now = q.poll();
		    if(now != null){
		        //System.out.println(now.num1 + " " + now.num2);
		        result += min(now.num1, now.num2);
		        q.add(new Num(a, max(now.num1, now.num2)));
		        q.add(new Num(a, min(now.num1, now.num2)));
		    }else{
		        q.add(new Num(a, a));
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

class Num {
	long num1;
	long num2;
	
	Num(long num1, long num2){
		this.num1 = num1;
		this.num2 = num2;
	}
}

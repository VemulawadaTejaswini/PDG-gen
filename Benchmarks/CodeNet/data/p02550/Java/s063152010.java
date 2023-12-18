import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
	    long n = sc.nextLong();
		int x = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[m];
		list[0] = x;
		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		int from = 0;
		int to = 0;
		hm.put((long)x, 0);
		for(int i = 1; i < m; i++){
		    long tmp = (long)(list[i-1]%m)*(list[i-1]%m)%m;
		    if(hm.containsKey(tmp)){
		        from = hm.get(tmp);
		        to = i-1;
		        break;
		    }else{
		        list[i] = (int)tmp;
		        hm.put(tmp, i);
		    }
		}
		//System.out.println(Arrays.toString(list));
		//System.out.println("from:" + from);
		//System.out.println("to:" + to);
		
		// 計算
		long result = 0;
		for(int i = 0; i < from; i++){
		    result += list[i];
		}
		int cnt = to - from + 1;
		long sum  = 0;
		for(int i = from; i <= to; i++){
		    sum += list[i];
		}
		result += (n - from)/cnt*sum;
		for(int i = 0; i < (n - from)%cnt; i++){
		    result += list[i+from];
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

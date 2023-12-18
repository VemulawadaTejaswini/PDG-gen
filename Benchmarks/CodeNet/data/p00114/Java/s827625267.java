import java.util.*;
import java.io.*;

public class Main {
	
	public long GCD(long x, long y){
		long max = Math.max(x, y);
		long min = Math.min(x, y);
		if( min == 0 ){
			return max;
		}
		return GCD(max%min, min);
	}
	public long LCM(long x, long y){
		long g = GCD(x, y);
		return x*y/g;
	}
	public long counter(int x, int y){
		long key = x;
		long count = 1;
		while( key != 1 ){
			key = (key*x)%y;
			count++;
		}
		return count;
	}
	public void solve() throws IOException{
		int a1, a2, a3, m1, m2, m3;
		while( (a1 = nextInt()) != 0 | (m1 = nextInt()) != 0 | (a2 = nextInt()) != 0 
				| (m2 = nextInt()) != 0 | (a3 = nextInt()) != 0 | (m3 = nextInt()) != 0 ){
			long x = counter(a1, m1);
			long y = counter(a2, m2);
			long z = counter(a3, m3);
			long ans = LCM(LCM(x, y), z);
			System.out.println(ans);
		}
	}
	
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}
	
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}
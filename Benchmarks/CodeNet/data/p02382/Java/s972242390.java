import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		double di1 = 0, di2 = 0, di3 = 0, diinf = 0;
		for(int i = 0; i < n; ++i)
			x[i] = sc.nextInt();
		for(int i = 0; i < n; ++i){
			x[i] = Math.abs(x[i] - sc.nextInt());
			di1 += x[i];
			di2 += x[i]*x[i];
			di3 += x[i]*x[i]*x[i];
			diinf = Math.max(diinf, x[i]);
		}
		System.out.printf("%.6f\n", di1);
		System.out.printf("%.6f\n", Math.sqrt(di2));
		System.out.printf("%.6f\n", Math.cbrt(di3));
		System.out.printf("%.6f\n", diinf);
	}

}

class NScanner{

	private BufferedReader br;
	private StringTokenizer tok;

	public NScanner(InputStream is) throws IOException{
		br = new BufferedReader(new InputStreamReader(is));
		getLine();
	}

	private void getLine() throws IOException{
		while(tok == null || !hasNext()){
			tok = new StringTokenizer(br.readLine());
		}
	}

	public boolean hasNext(){
		return tok.hasMoreTokens();
	}

	public String next() throws IOException{
		if(hasNext()){
			return tok.nextToken();
		}else{
			getLine();
			return tok.nextToken();
		}
	}

	public int nextInt() throws IOException{
		if(hasNext()){
			return Integer.parseInt(tok.nextToken());
		}else{
			getLine();
			return Integer.parseInt(tok.nextToken());
		}
	}

	public long nextLong() throws IOException{
		if(hasNext()){
			return Long.parseLong(tok.nextToken());
		}else{
			getLine();
			return Long.parseLong(tok.nextToken());
		}
	}

	public double nextDouble() throws IOException{
		if(hasNext()){
			return Double.parseDouble(tok.nextToken());
		}else{
			getLine();
			return Double.parseDouble(tok.nextToken());
		}
	}
}

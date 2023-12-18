import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			double mean = 0.0;
			for(int i = 0; i < n; ++i){
				a[i] = sc.nextInt(); mean += a[i];
			}
			mean /= n;
			double vari = 0.0;
			for(int i = 0; i < n; ++i){
				double dev = a[i] - mean;
				vari += dev*dev/n;
			}
			System.out.printf("%.6f\n", Math.sqrt(vari));
		}
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

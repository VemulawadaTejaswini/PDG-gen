import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < m; ++j)
				A[i][j] = sc.nextInt();
		}
		for(int i = 0; i < m; ++i){
			for(int j = 0; j < l; ++j)
				B[i][j] = sc.nextInt();
		}
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < l; ++j){
				if(j != 0) System.out.print(" ");
				long c = 0;
				for(int k = 0; k < m; ++k)
					c += A[i][k] * B[k][j];
				System.out.print(c);
			}
			System.out.println();
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

	private boolean hasNext(){
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

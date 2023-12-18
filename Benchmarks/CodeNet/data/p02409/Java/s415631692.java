import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int[][][] num = new int[4][3][10];
		for(int[][] a: num){
			for(int[] b: a){
				Arrays.fill(b, 0);
			}
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i){
			int b = sc.nextInt() - 1;
			int f = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			int v = sc.nextInt();
			num[b][f][r] += v;
		}
		
		for(int i = 0; i < 4; ++i){
			if(i != 0) System.out.println("####################");
			for(int j = 0; j < 3; ++j){
				for(int k = 0; k < 10; ++k)
					System.out.printf(" %d", num[i][j][k]);
				System.out.println();
			}
			
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

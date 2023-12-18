import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		for(;;){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1)
				break;
			char ans;
			int score = m + f;
			if(score < 30)
				ans = 'F';
			else if(score < 50){
				if(r < 50) ans = 'D';
				else ans = 'C';
			}
			else if(score < 65)
				ans = 'C';
			else if(score < 80)
				ans = 'B';
			else ans = 'A';
			if(m == -1 || f == -1)
				ans = 'F';
			System.out.println(ans);
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

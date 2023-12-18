import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int n = sc.nextInt();
		//0:S 1:H 2:C 3:D
		boolean[][] card = new boolean[4][13];
		for(int i = 0; i < 4; ++i)
			Arrays.fill(card[i], false);
		for(int i = 0; i < n; ++i){
			String suit = sc.next();
			int val = sc.nextInt() - 1;
			if(suit.equals("S"))
				card[0][val] = true;
			else if(suit.equals("H"))
				card[1][val] = true;
			else if(suit.equals("C"))
				card[2][val] = true;
			else if(suit.equals("D"))
				card[3][val] = true;
		}
		
		char[] st = {'S', 'H', 'C', 'D'};
		for(int i = 0; i < 4; ++i){
			for(int j = 0; j < 13; ++j){
				if(!card[i][j])
					System.out.printf("%c %d\n", st[i], j+1);
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

import java.util.*;
import java.io.*;

public class Main {
	
	int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] month = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	public int count(int y, int m, int d){
		int num = month[m] + d; 
		if( (y%4 == 0 && y%100 != 0) || y%400 == 0 ){
			if( m > 2 ){
				num++;
			}
		}
		num += y*365 + (y-1)/4 +1 - (y-1)/100 + (y-1)/400;
		if( y == 0 ){
			num--;
		}
		return num;
	}		
	public void solve() throws IOException{
		int y1, m1, d1, y2, m2, d2;
		while( (y1 = nextInt()) >= 0 && (m1 = nextInt()) >= 0 && (d1 = nextInt()) >= 0 &&
				(y2 = nextInt()) >= 0 && (m2 = nextInt()) >= 0 && (d2 = nextInt()) >= 0 ){
			int ans = count(y2, m2, d2) - count(y1, m1, d1);
			writer.println(ans);
		}
		writer.flush();
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
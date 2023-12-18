import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException{
		boolean flag = false;
		while( stdIn.hasNext() ){
			if( flag ){
				writer.println();
			}
			flag = true;
			String str = stdIn.next();
			char[][] result = new char[5][8];
			for(int i = 0; i < 5; i++){
				result[i][0] = ' ';
				result[i][1] = ' ';
				result[i][2] = '=';
				result[i][3] = '*';
				result[i][4] = '*';
				result[i][5] = '*';
				result[i][6] = '*';
				result[i][7] = '*';
			}
			int n = 5-str.length();
			int temp = n;
			while( n-- > 0 ){
				result[n][0] = '*';
				result[n][3] = ' ';
			}
			for(int i = 0; i < str.length(); i++){
				int x = str.charAt(i)-'0';
				int a = x/5;
				result[i+temp][a] = '*';
				int b = x%5+3;
				result[i+temp][b] = ' ';
			}
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 5; j++){
					writer.print(result[j][i]);
				}
				writer.println();
			}
		}
		writer.flush();
	}
			
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
}
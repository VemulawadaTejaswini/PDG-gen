import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;

class Main {
	public static void main(String[] args){
		try {
			
			/* 入力 */
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			String str[] = (br.readLine()).split("\\s+");
			int P = Integer.parseInt(str[0]); 
			int Q = Integer.parseInt(str[1]);
			int R = Integer.parseInt(str[2]);

			PrintWriter pw = new PrintWriter(System.out);		
			
			// 標準出力
			pw.println(Math.min(P+Q,Math.min(Q+R,R+P)));
			
			pw.flush();
			
		} catch(IOException e) { System.out.println("Exception :" + e); }
	}
}
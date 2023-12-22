// Q1
import java.io.*;
import java.lang.Integer;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in  = br.readLine() ;
			String[] numStr = in.split(" ");
			int[] num = new int[4];
			num[0] = Integer.parseInt(numStr[0]);
			num[1] = Integer.parseInt(numStr[1]);
			num[2] = Integer.parseInt(numStr[2]);
			if ( num[0] < num[1] && num[1] < num[2] ) {
				System.out.println( "Yes");
			} else  {
				System.out.println( "No");
			} 
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}
import java.io.*;
import java.lang.Integer;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in  = br.readLine() ;
			String[] numStr = in.split(" ");
			int[] num = new int[2];
			num[0] = Integer.parseInt(numStr[0]);
			num[1] = Integer.parseInt(numStr[1]);
			int a1 = num[0]/num[1];
			int a2 = num[0]%num[1];
			double f1 = num[1];
			f1 = num[0]/f1;
			System.out.printf("%d %d %9.5f" , a1, a2, f1);
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}
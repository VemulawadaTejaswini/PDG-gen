import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);

		if((0 < a) && (b < Math.pow(10,9))){ //10???9???
			int d = a / b;
			int r = a % b;
			double f = ((double)a / b);


			System.out.printf("%d %d %05f",d ,r ,f);
		}
	}
}
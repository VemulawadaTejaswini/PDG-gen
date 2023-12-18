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

		int d = a / b;
		int r = a % b;
		float f = (float)a / b;

		System.out.println(d +" "+r+" "+f);
	}
}
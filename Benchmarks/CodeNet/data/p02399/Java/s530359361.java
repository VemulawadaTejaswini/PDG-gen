import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.split(" ");
		long a = Integer.parseInt(strArray[0]);
		long b = Integer.parseInt(strArray[1]);

		long d = a/b;
		long r = a%b;
		float f = (float)a/b;
		System.out.printf("%6f %6f %6f", d,r,f);
	}
}
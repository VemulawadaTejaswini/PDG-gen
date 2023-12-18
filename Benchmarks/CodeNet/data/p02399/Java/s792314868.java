import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] a_b = str.split(" ", 0);

		int a = Integer.parseInt(a_b[0]);
		int b = Integer.parseInt(a_b[1]);
		float af = a;
		float bf = b;

		int d = a/b;
		int r = a%b;
		float f = af/bf;

		System.out.println(d+" "+r+" "+f);
	}
}
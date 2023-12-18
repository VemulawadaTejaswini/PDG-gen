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
		long af = a;
		long bf = b;

		int d = a/b;
		int r = a%b;
		long f = af/bf;

		System.out.println(d+" "+r+" "+f);
	}
}
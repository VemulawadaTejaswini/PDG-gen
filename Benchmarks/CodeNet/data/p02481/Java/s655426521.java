

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("??????????????????");
		String line1 = reader.readLine();
		int a = Integer.parseInt(line1);
		System.out.println("?¨????????????????");
		String line2 = reader.readLine();
		int b = Integer.parseInt(line2);

		int S = a * b;
		int L = 2 * (a + b);

		System.out.println("" + S + " " + L + "");

	}
}
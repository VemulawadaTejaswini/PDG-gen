

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r = br.readLine();
		String[] cut = r.split(" ");

		String a = cut[0];
		String b = cut[1];
		String c = cut[2];

		char w = a.charAt(a.length() - 1);
		char x = b.charAt(0);
		char y = b.charAt(b.length() - 1);
		char z = c.charAt(0);

		System.out.println(w == x && y == z ? "YES" : "NO");

	}
}
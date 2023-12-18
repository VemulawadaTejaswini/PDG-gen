

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		String Array[] = new String[2];
		long a, b;
		long kouyaku = 0;
		while ((str = br.readLine()) != null) {
			Array = str.split(" ");
			a = Long.parseLong(Array[0]);
			b = Long.parseLong(Array[1]);
			kouyaku = gcd(a, b);
			System.out.printf("%d %d\n", kouyaku, a * b / kouyaku);

		}
	}

	public static long gcd(long a, long b) {
		return b==0 ? a : gcd(b,a%b);
	}

}
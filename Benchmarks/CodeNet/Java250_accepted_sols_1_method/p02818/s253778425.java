import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long k = Long.parseLong(str[2]);

		if (a + b <= k) {
			System.out.println("0 0");
		} else {
			long c = k - a;
			long d = b;

			if (c >= 0) {
				d -= c;
			}

			a -= k;

			System.out.println(((a >= 0) ? a : 0) + " " + ((d >= 0) ? d : 0));
		}
	}
}

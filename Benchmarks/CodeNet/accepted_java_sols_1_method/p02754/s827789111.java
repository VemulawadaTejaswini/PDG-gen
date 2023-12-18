import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = r.readLine().split(" ");

		long n = Long.parseLong(l1[0]);
		long a = Long.parseLong(l1[1]);
		long b = Long.parseLong(l1[2]);

		long cnt = n / (a + b);
		long res = n % (a + b);
		if (res > a) {
			res = a;
		}

		System.out.println(String.valueOf(a * cnt + res));

		r.close();
	}
}
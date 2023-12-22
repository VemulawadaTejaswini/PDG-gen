import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long n = Long.parseLong(str[0]);
		long k = Long.parseLong(str[1]);

		long m = n % k;
		if (m == 0) {
			System.out.println("0");
		} else {
			long min = Math.min(m, k - m);
			System.out.println(min);
		}
	}
}
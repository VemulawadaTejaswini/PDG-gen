import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n % 2 == 0) {
			System.out.println("-1");
			return;
		}

		long b = 7l;
		int count = 1;
		while (count < 10000000) {
			if (b % n == 0) {
				System.out.println(count);
				return;
			}
			b *= 10;
			b += 7;
			b %= n;
			count++;
		}
		System.out.println(-1);
	}
}
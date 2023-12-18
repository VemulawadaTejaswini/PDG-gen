import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		long ans = 0;

		for (int c = 1; c < n; c++) {
			ArrayList<Long> list = divisor(n - c);
			ans += list.size();
		}
		System.out.println(ans);
	}

	public static final ArrayList<Long> divisor(final long n) {
		final ArrayList<Long> list = new ArrayList<>();

		for (long i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i); // a x b
				if (i != n / i) {
					list.add(n / i); // b x a (逆向き)
				}
			}
		}
		return list;
	}
}

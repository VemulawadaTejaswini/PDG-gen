import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		long a[] = new long[n + 10];
		long s[] = new long[n + 10];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		s[0] = a[0];
		for (int i = 1; i < n; i++) {
			s[i] = s[i - 1] + a[i];
		}

		for (int i = k; i < n; i++) {
			long right = s[i] - s[i - k];
			long left = s[i - 1];

			if (i - k > 0) {
				left -= s[i - k - 1];
			}

			if (left < right) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
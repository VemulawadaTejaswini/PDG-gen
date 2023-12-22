import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long a = Long.parseLong(str[1]);
		long b = Long.parseLong(str[2]);

		long x[] = new long[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			x[i] = Long.parseLong(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			long dist = x[i + 1] - x[i];
			if (dist * a < b) {
				ans += dist * a;
			} else {
				ans += b;
			}
		}

		System.out.println(ans);
	}
}

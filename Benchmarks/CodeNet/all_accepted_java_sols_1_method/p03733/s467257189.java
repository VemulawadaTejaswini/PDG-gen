import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long T = Long.parseLong(str[1]);

		long t[] = new long[n];
		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			t[i] = Long.parseLong(str[i]);
		}

		long sum = 0;
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			long diff = t[i + 1] - t[i];

			if (diff < T) {
				sum += diff;
			} else {
				ans += sum + T;
				sum = 0;
			}
		}
		ans += sum + T;

		System.out.println(ans);
	}
}

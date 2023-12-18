import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);

			if (a[i] == 0) {
				System.out.println("0");
				return;
			}
		}

		long ans = 1;
		int count = 0;

		for (int i = 0; i < n; i++) {
			count += str[i].length();

			ans *= a[i];
			if (count > 18 && ans != 1000000000000000000L) {
				System.out.println("-1");
				return;
			}

		}

		System.out.println(ans);
	}
}
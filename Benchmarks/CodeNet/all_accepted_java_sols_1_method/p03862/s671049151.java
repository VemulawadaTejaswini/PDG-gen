import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		long a[] = new long[n];
		long ans = 0;

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
			if (a[i] > x) {
				ans += a[i] - x;
				a[i] = x;
			}
		}

		for (int i = 1; i < n; i++) {
			if (a[i - 1] + a[i] > x) {
				ans += (a[i - 1] + a[i]) - x;
				a[i] -= (a[i - 1] + a[i]) - x;
			}
		}
		System.out.println(ans);

	}
}
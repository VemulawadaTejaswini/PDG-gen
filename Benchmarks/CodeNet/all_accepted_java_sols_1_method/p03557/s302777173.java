import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Integer a[] = new Integer[n];
		Integer b[] = new Integer[n];
		Integer c[] = new Integer[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			int aup = ~Arrays.binarySearch(a, b[i], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
			int cup = ~Arrays.binarySearch(c, b[i], (x, y) -> x.compareTo(y) > 0 ? 1 : -1);

			ans += (long) aup * (n - cup);
		}

		System.out.println(ans);
	}
}

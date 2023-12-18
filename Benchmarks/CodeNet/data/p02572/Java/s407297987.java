import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long k = a[i] % 1000000007;
				long l = a[j] % 1000000007;
				long m = (k * l) % 1000000007;
				ans += m % 1000000007;
			}
		}

		System.out.println(ans % 1000000007);
	}

}
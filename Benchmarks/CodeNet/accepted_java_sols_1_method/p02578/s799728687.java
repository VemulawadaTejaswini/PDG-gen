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

		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				sum += a[i] - a[i + 1];
				a[i + 1] += a[i] - a[i + 1];
			}
		}

		System.out.println(sum);
	}
}

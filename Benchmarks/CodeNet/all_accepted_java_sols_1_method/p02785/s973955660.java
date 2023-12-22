import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(a);

		long sum = 0;
		for (int i = 0; i < n - k; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}

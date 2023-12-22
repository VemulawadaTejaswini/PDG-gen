import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];

		long sum = 0;
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
			sum += a[i];
		}

		long ans = Long.MAX_VALUE;
		long left = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.min(ans, Math.abs(sum - left - left));

			left += a[i];
		}

		System.out.println(ans);
	}
}

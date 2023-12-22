import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(a);

		long s = 0;

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (s * 2 < a[i]) {
				ans = 0;
			}
			s += a[i];
			ans++;
		}

		System.out.println(ans);
	}
}
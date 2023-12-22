import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n + 1];
		int b[] = new int[n];

		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n + 1; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				ans += Math.min(a[i], b[i]);
				int temp = a[i];
				a[i] -= b[i];
				b[i] -= temp;
			}

			if (a[i] <= 0 && b[i] > 0) {
				ans += Math.min(a[i + 1], b[i]);
				int temp1 = a[i + 1];
				a[i + 1] -= b[i];
				b[i] -= temp1;
			}
		}

		System.out.println(ans);
	}
}
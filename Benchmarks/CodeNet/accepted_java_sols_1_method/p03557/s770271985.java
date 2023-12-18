import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

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
		Arrays.sort(c);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			int left = -1;
			int right = n;

			long temp1;
			long temp2;

			while (right - left > 1) {
				int mid = (right + left) / 2;

				if (a[mid] >= b[i]) {
					right = mid;
				} else {
					left = mid;
				}
			}
			temp1 = right;

			left = -1;
			right = n;
			while (right - left > 1) {
				int mid = (right + left) / 2;

				if (c[mid] > b[i]) {
					right = mid;
				} else {
					left = mid;
				}
			}
			temp2 = n - right;

			ans += temp1 * temp2;
		}

		System.out.println(ans);
	}
}

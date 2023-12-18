import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int dp[][] = new int[(1 << 21) + 1][21];
	static int dist[][] = new int[21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		long k = Long.parseLong(str[2]);

		long a[] = new long[n];
		long b[] = new long[m];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}
		str = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			b[i] = Long.parseLong(str[i]);
		}

		long value = 0;
		int acount = 0;
		int bcount = 0;
		long ans = 0;

		while (value < k) {
			if (acount >= n && bcount >= m) {
				break;
			}

			if (acount >= n) {
				if (value + b[bcount] > k) {
					break;
				}
				value += b[bcount];
				bcount++;
				ans++;
			} else if (bcount >= m) {
				if (value + a[acount] > k) {
					break;
				}
				value += a[acount];
				acount++;
				ans++;
			} else {

				if (a[acount] < b[bcount]) {
					if (value + a[acount] > k) {
						break;
					}
					value += a[acount];
					acount++;
					ans++;
				} else {
					if (value + b[bcount] > k) {
						break;
					}
					if (bcount < m) {
						value += b[bcount];
						bcount++;
						ans++;
					} else if (acount < n) {
						if (value + a[acount] > k) {
							break;
						}
						value += a[acount];
						acount++;
						ans++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}

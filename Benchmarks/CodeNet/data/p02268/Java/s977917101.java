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

		int s[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(s);

		int q = Integer.parseInt(br.readLine());

		str = br.readLine().split(" ");

		int ans = 0;
		for (int i = 0; i < q; i++) {
			int t = Integer.parseInt(str[i]);

			int left = 0;
			int right = n;
			int mid = 0;

			while (right - left > 1) {
				mid = (right + left) / 2;

				if (t == s[mid]) {
					ans++;
					break;
				}
				if (t > s[mid]) {
					left = mid;
				} else {
					right = mid;
				}
			}
		}

		System.out.println(ans);
	}
}


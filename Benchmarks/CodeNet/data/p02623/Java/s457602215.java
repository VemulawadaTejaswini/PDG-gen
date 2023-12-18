import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

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

		ArrayList<Long> s1 = new ArrayList<>();
		ArrayList<Long> s2 = new ArrayList<>();

		s1.add(a[0]);
		s2.add(b[0]);

		for (int i = 0; i < n - 1; i++) {
			s1.add(s1.get(i) + a[i + 1]);
		}
		for (int i = 0; i < m - 1; i++) {
			s2.add(s2.get(i) + b[i + 1]);
		}
		int nowj = m - 1;
		while (nowj >= 0 && s2.get(nowj) > k) {
			nowj--;
		}

		int maxi = n - 1;
		while (maxi >= 0 && s1.get(maxi) > k) {
			maxi--;
		}
		int count = Math.max(nowj + 1, maxi + 1);
		for (int i = 0; i <= maxi; i++) {
			while (nowj >= 0 && s1.get(i) + s2.get(nowj) > k) {
				nowj--;
			}
			if (nowj + 2 + i > count) {
				count = nowj + 2 + i;
			}
		}

		System.out.println(count);
	}
}

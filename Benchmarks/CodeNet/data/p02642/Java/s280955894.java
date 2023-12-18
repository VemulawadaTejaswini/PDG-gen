import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		int n = Integer.parseInt(sl[0]);

		s = r.readLine();
		sl = s.split(" ");
		int a[] = new int[n + 1];
		boolean b[] = new boolean[n + 1];
		a[n] = 1000000009;

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sl[i]);
		}

		Arrays.sort(a);

		int v = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == a[i + 1]) {
				while (a[i] == a[i + 1]) {
					i++;
				}
				i++;
			}
			if (b[i])
			{
				continue;
			}
			if (n <= i) {
				break;
			}
			int left = i + 1;
			int right = n;
			int target = a[i];
			while (target <= a[n - 1]) {
				target += a[i];
				left = i + 1;
				right = n;
				while (left + 1 < right) {
					int mid = (left + right) / 2;
					if (a[mid] <= target) {
						left = mid;
					} else {
						right = mid;
					}
				}
				if (a[left] == target) {
					b[left] = true;
				}
			}
			//System.out.println(a[i]);
			v++;
		}

		System.out.println(v);
	}
}
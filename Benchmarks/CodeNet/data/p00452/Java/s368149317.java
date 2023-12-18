import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = Integer.parseInt(sc.next()); // ?¨?????????°
			int m = Integer.parseInt(sc.next()); // ?????????????????°

			if (n == 0 && m == 0) {
				break;
			}

			int[] a = new int[n + 1];
			a[0] = 0;
			for (int i = 1; i < a.length; i++) {
				a[i] = Integer.parseInt(sc.next());
			}
			int[] sum = new int[(n + 1) * (n + 1)];
			int cnt = 0;
			for (int i = 0; i < n + 1; i++) {
				for (int j = 0; j < n + 1; j++) {
					sum[cnt] = a[i] + a[j];
					cnt++;
				}
			}

			Arrays.sort(sum);
			int ans = -1;
			for (int i = 0; i < sum.length; i++) {
				int left = 0;
				int right = sum.length;
				ans = -1;
				if (m - sum[i] < 0) {
					continue;
				}

				while (right > left) {
					int middle = (left + right) / 2;
					int value = sum[middle];
					if (value > (m - sum[i])) {
						right = middle;
					} else if (value < (m - sum[i])) {
						left = middle + 1;

					} else {
						System.out.println(m);
						break;

					}

				}
				int temp = sum[i] + sum[right - 1];
				if (ans < temp && temp <= m) {
					ans = temp;
				}

			}

			System.out.println(ans);
		}
	}
}
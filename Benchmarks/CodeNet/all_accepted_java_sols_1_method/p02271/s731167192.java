import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int q = Integer.parseInt(br.readLine());
		int m[] = new int[q];

		str = br.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			m[i] = Integer.parseInt(str[i]);
		}

		boolean flag[] = new boolean[q];

		for (int i = 0; i < Math.pow(2, n); i++) {
			int sum = 0;

			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					sum += a[j];
				}
			}
			for (int j = 0; j < q; j++) {
				if (sum == m[j] && !flag[j]) {
					flag[j] = true;
				}
			}
		}

		for (int i = 0; i < q; i++) {
			if (flag[i]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}

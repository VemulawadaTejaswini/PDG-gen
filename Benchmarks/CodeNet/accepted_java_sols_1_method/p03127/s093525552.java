import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];
		boolean flag[] = new boolean[n];
		String str[] = br.readLine().split(" ");

		int min = Integer.MAX_VALUE;
		int minI = 0;

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);

			if (a[i] < min) {
				min = a[i];
				minI = i;
			}
		}

		int count = 0;

		while (count + 1 != n) {
			int min2 = Integer.MAX_VALUE;
			int min2I = 0;

			for (int i = 0; i < n; i++) {
				if (minI == i)
					continue;

				a[i] = a[i] % min;

				if (a[i] < min2 && a[i] != 0) {
					min2 = a[i];
					min2I = i;
				}

				if (a[i] == 0 && !flag[i]) {
					flag[i] = true;
					count++;
				}

			}
			if (min > min2) {
				min = min2;
				minI = min2I;
			}
		}

		System.out.println(min);
	}
}

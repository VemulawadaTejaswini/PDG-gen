
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] s = reader.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int minj = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minj]) {
					minj = j;
				}

			}
			if (i != minj) {
				int tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
				sum++;
			}
		}

		StringBuilder builder = new StringBuilder();
		for (int k = 0; k < n; k++) {
			if (k > 0)
				builder.append(" ");
			builder.append(a[k]);
		}
		builder.append("\n").append(sum);
		System.out.println(builder);

	}
}
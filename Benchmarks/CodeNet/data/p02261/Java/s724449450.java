
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] a = reader.readLine().split(" ");

		String[] b = Arrays.copyOf(a, a.length);
		bubble(a, n);
		append(a, n);
		builder.append("Stable\n");
		selection(b, n);
		append(b, n);
		builder.append(Arrays.equals(a, b)?"Stable\n":"Not stable\n");
		System.out.print(builder);
	}

	public static void selection(String[] a, int n) {

		for (int i = 0; i < n; i++) {
			int minj = i;
			for (int j = i + 1; j < n; j++) {
				if (toInt(a, j) < toInt(a, minj)) {
					minj = j;
				}

			}
			if (i != minj) {
				String tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
			}
		}
	}

	public static void bubble(String[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j >= i + 1; j--) {
				if (toInt(a, j) < toInt(a, j - 1)) {
					String temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}

	public static int toInt(String[] a, int j) {
		return a[j].charAt(1);
	}

	public static void append(String[] a, int n) {
		for (int k = 0; k < n; k++) {
			if (k > 0)
				builder.append(" ");
			builder.append(a[k]);
		}
		builder.append("\n");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}

			int[] a = new int[10];
			for (int i = 0; i < line.length(); i++) {
				a[line.charAt(i) - '0']++;
			}
			int[] result = new int[10];
			for (int i = 1; i < 10; i++) {
				if (a[i] == 4) {
					continue;
				}

				for (int j = 1; j < 10; j++) {
					int[] m = Arrays.copyOf(a, a.length);
					m[i]++;
					m[j] -= 2;
					for (int k = 1; k < 8; k++) {
						if (m[k] < 0) {
							m[9] = -1;
							break;
						}
						if (m[k] == 1 || m[k] == 4) {
							m[k]--;
							m[k + 1]--;
							m[k + 2]--;
						} else if (m[k] == 2) {
							m[k] -= 2;
							m[k + 1] -= 2;
							m[k + 2] -= 2;
						}
					}
					if ((m[8] == 0 || m[8] == 3) && (m[9] == 0 || m[9] == 3)) {
						result[i]++;
						break;
					}
				}
			}
			int count = 0;
			boolean flag = false;
			for (int i = 1; i < 10; i++) {
				if (result[i] == 1) {
					flag = true;
					if (count != 0) {
						builder.append(' ');

					}
					builder.append(i);
					count++;
				}
			}

			if (!flag) {
				builder.append(0);
			}
			builder.append('\n');
		}
		System.out.print(builder);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			int a = Integer.parseInt(line);
			int[] num = new int[25];
			int max = 51000;
			int min = 0;
			int m = a - 72 < 2 ? 2 : a - 72;
			for (int i = m; i < a + 72; i++) {
				if (isPrime(i))
					if (i < a) {
						min = Math.max(min, i);
					} else if (i > a) {
						max = Math.min(max, i);
					}
			}
			builder.append(min).append(' ').append(max).append('\n');

		}
		System.out.print(builder);
	}

	private static boolean isPrime(int a) {
		if (a == 2)
			return true;
		if (a % 2 == 0)
			return false;
		if (a < 8)
			return true;
		if (a % 3 == 0)
			return false;
		for (int i = 5; a >= i * i; i += 6) {
			if (a % i == 0)
				return false;
			if (a % (i + 2) == 0)
				return false;
		}

		return true;
	}
}
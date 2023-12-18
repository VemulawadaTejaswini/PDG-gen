
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
			int a = Integer.MAX_VALUE;
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				int b = getNum(line.charAt(i));
				if (a >= b) {
					sum += b;
				} else {
					sum = sum - a * 2 + b;
				}
				a = b;
			}
			builder.append(sum).append('\n');
		}
		System.out.print(builder);
	}

	private static int getNum(char charAt) {
		switch (charAt) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		default:
			return 1000;
		}
	}
}
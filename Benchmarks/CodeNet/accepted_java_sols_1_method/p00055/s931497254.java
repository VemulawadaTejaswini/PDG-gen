
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
			if (line.isEmpty())
				break;
			double a = Double.parseDouble(line);

			double sum = a;
			for (int i = 0; i < 9; i++) {
				if (i % 2 == 0) {
					a = a * 2;
				} else {
					a = a / 3;
				}
				sum += a;
			}
			System.out.println(sum);
		}
	}
}
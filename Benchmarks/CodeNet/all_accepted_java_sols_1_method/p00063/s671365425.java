
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
		int count = 0;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;

			String newLine = new StringBuilder(line).reverse().toString();
			if (line.equals(newLine)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
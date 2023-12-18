
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
			StringTokenizer tokenizer = new StringTokenizer(line);
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			int c = Integer.parseInt(tokenizer.nextToken());

			int count = 0;
			for (int i = 1; i < 11; i++) {
				if (i != a && i != b && i != c) {
					if (a + b + i < 21) {
						count++;
					}
				}
			}
			System.out.println(count > 3 ? "YES" : "NO");
		}
	}
}
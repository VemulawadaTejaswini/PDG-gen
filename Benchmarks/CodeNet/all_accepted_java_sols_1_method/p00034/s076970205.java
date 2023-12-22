
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
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			int sum = 0;
			int[] nums = new int[10];
			for (int i = 0; i < 10; i++) {
				sum += Integer.parseInt(tokenizer.nextToken());
				nums[i] = sum;
			}
			double a = Double.parseDouble(tokenizer.nextToken());
			double b = Double.parseDouble(tokenizer.nextToken());

			double c = sum / (a + b) * a;

			for (int i = 0; i < 10; i++) {
				if (nums[i] >= c) {
					System.out.println(i + 1);
					break;
				}

			}
		}
	}
}
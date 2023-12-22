
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
		StringTokenizer tokenizer;
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			tokenizer = new StringTokenizer(reader.readLine());
			double x1 = Double.parseDouble(tokenizer.nextToken());
			double y1 = Double.parseDouble(tokenizer.nextToken());
			double x2 = Double.parseDouble(tokenizer.nextToken());
			double y2 = Double.parseDouble(tokenizer.nextToken());
			double x3 = Double.parseDouble(tokenizer.nextToken());
			double y3 = Double.parseDouble(tokenizer.nextToken());

			double A = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
			double B = Math.pow(x1, 2) - Math.pow(x3, 2) + Math.pow(y1, 2)
					- Math.pow(y3, 2);
			double C = (y1 - y3) * (x1 - x2) - (y1 - y2) * (x1 - x3);
			double b = (B * (x1 - x2) - A * (x1 - x3)) / (2 * C);
			double a = (B * (y1 - y2) - A * (y1 - y3)) / (2 * (-C));
			double r = Math.sqrt((x1 - a) * (x1 - a) + (y1 - b) * (y1 - b));

			builder.append(String.format("%.3f %.3f %.3f\n", a, b, r));
		}
		System.out.print(builder);

	}

}
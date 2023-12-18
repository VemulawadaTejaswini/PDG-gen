
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
			double[] x = new double[4];
			double[] y = new double[4];
			for (int i = 0; i < 4; i++) {
				x[i] = Double.parseDouble(tokenizer.nextToken());
				y[i] = Double.parseDouble(tokenizer.nextToken());
			}
			double a = (x[0] - x[1]) * (x[2] - x[3]);
			double b = (y[0] - y[1]) * (y[2] - y[3]);
			if (a + b == 0.0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.valueOf(reader.readLine());
		double[] x = new double[6];

		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int j = 0; j < 6; j++) {
				x[j] = Double.parseDouble(tokenizer.nextToken());
			}
			double AB = Math.sqrt(Math.pow(x[3] - x[0], 2)
					+ Math.pow(x[4] - x[1], 2));
			if (AB <= (x[2] + x[5])) {
				if (AB < x[2] - x[5]) {
					System.out.println(2);
				} else if (AB < x[5] - x[2]) {
					System.out.println(-2);
				} else
					System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
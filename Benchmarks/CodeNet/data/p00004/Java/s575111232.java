import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while ((str = br.readLine()) != null) {
			String[] num = str.split(" ", 0);

			double a = Double.parseDouble(num[0]);
			double b = Double.parseDouble(num[1]);
			double c = Double.parseDouble(num[2]);
			double d = Double.parseDouble(num[3]);
			double e = Double.parseDouble(num[4]);
			double f = Double.parseDouble(num[5]);

			double x = (c * e - b * f) / (a * e - b * d);
			double y = (a * f - c * d) / (a * e - b * d);

			if (x == -0) {
				x = 0;
			}
			if (y == -0) {
				y = 0;
			}

			System.out.printf("%4.3f %4.3f\n", x, y);
		}
	}
}
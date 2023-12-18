
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
		StringTokenizer to;
		double[] nums = new double[6];
		String s;
		while ((s = reader.readLine()) != null) {
			to = new StringTokenizer(s);
			for (int i = 0; i < 6; i++) {
				nums[i] = Double.parseDouble(to.nextToken());
			}
			double a = nums[0];
			double b = nums[1];
			double c = nums[2];
			double d = nums[3];
			double e = nums[4];
			double f = nums[5];

			double x = (c * e - f * b) / (a * e - b * d);
			double y = (c * d - f * a) / (b * d - a * e);

			builder.append(String.format("%.3f %.3f\n", x, y));

		}
		System.out.print(builder);
	}
}
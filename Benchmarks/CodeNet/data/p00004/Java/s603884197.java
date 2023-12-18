
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
		while ((s=reader.readLine()) != null) {
			to  = new StringTokenizer(s);
			for (int i = 0; i < 6; i++) {
				nums[i] = Double.parseDouble(to.nextToken());
			}
			double det = nums[0] * nums[4] - nums[1] * nums[3];
			double x = (nums[4] * nums[2] - nums[1] * nums[5]) / det;
			double y = (-nums[3] * nums[2] + nums[0] * nums[5]) / det;

			if (x == -0.0)
				x = 0.0;
			if (y == -0.0)
				y = 0.0;
			builder.append(String.format("%.3f %.3f\n", x, y));

		}
		System.out.print(builder);
	}
}
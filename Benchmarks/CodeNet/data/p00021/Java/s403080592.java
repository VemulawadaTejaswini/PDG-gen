
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			String[] line = reader.readLine().split(" ");
			double[] nums = new double[8];
			for (int j = 0; j < 8; j++) {
				nums[j] = Double.parseDouble(line[j]);
			}
			if ((nums[3] - nums[1]) / (nums[2] - nums[0]) == (nums[7] - nums[5])
					/ (nums[6] - nums[4]))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
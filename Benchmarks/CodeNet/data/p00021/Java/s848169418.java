
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
		int n = Integer.parseInt(reader.readLine());
		double[] nums = new double[8];
		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int j = 0; j < 8; j++) {
				nums[j] = Double.parseDouble(tokenizer.nextToken());
			}
			double A = (nums[3] - nums[1]) / (nums[2] - nums[0]);
			double B = (nums[7] - nums[5]) / (nums[6] - nums[4]);
			if (A == B)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
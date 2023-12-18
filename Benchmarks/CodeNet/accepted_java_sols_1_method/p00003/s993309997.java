
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int a = Integer.parseInt(reader.readLine());
		for (int i = 0; i < a; i++) {
			String[] line = reader.readLine().split(" ");
			int[] nums = new int[3];
			for (int j = 0; j < 3; j++) {
				nums[j] = Integer.parseInt(line[j]);
			}
			Arrays.sort(nums);
			if (Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(
					nums[2], 2))
				builder.append("YES\n");
			else
				builder.append("NO\n");
		}
		System.out.print(builder);

	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(tokenizer.nextToken());
		}
		Arrays.sort(nums);
		for (int i = 4; i >= 0; i--) {
			if (i != 4) {
				builder.append(' ');
			}
			builder.append(nums[i]);
		}
		System.out.println(builder);
	}
}
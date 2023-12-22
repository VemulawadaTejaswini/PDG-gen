/**
 * Sum of Consecutive Integers
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[] nums = new int[n / 2 + 2];
			for (int i = 1; i < nums.length; i++) {
				nums[i] = nums[i - 1] + i;
			}

			int count = 0;
			for (int i = 1; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					int sum = nums[j] - nums[i - 1];
					if (sum == n) {
						count++;
					} else if (sum > n) {
						break;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}
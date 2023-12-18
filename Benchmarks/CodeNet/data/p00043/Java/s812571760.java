import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Puzzle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int[] nums = new int[10];

			for (int i = 0; i < line.length(); i++) {
				nums[line.charAt(i) - '0']++;
			}

			String ans = "";

			for (int i = 1; i <= 9; i++) {
				if (nums[i] < 4) {
					nums[i]++;
					if (check(nums)) {
						ans += String.valueOf(i);
					}
					nums[i]--;
				}
			}

			if (ans.length() == 0) {
				System.out.println(0);
			} else {
				System.out.println(String.join(" ", ans.split("")));
			}

		}
	}

	static boolean check(int[] nums) {

		boolean ret = false;

		for (int i = 1; i <= 9; i++) {
			if (nums[i] >= 2) {
				nums[i] -= 2;
				ret |= check3(nums);
				nums[i] += 2;
			}
		}

		return ret;
	}

	static boolean check3(int[] nums) {

		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum += nums[i];
		}
		if (sum == 0) return true;

		//
		boolean ret = false;

		for (int i = 1; i <= 7; i++) {
			if (nums[i] > 0 && nums[i + 1] > 0 && nums[i + 2] > 0) {
				nums[i]--;
				nums[i + 1]--;
				nums[i + 2]--;
				ret |= check3(nums);
				nums[i]++;
				nums[i + 1]++;
				nums[i + 2]++;
			}
		}

		for (int i = 1; i <= 9; i++) {
			if (nums[i] >= 3) {
				nums[i] -= 3;
				ret |= check3(nums);
				nums[i] += 3;
			}
		}

		return ret;
	}
}
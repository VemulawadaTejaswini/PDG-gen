/**
 * Recurring Decimals
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int a = parseInt(line.substring(0, line.indexOf(' ')));
			int L = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((a | L) == 0) break;

			Map<Integer, Integer> diff = new HashMap<Integer, Integer>();
			int count = 0;

			diff.put(a, count);
			while (count <= 20) {
				count++;
				int[] nums = new int[10];
				for (int i = L - 1; i >= 0; i--) {
					nums[a / (int) Math.pow(10, i)]++;
					a %= (int) Math.pow(10, i);
				}

				int[] _nums;
				int max = 0, min = 0, fig;
				// max
				fig = L - 1;
				_nums = Arrays.copyOf(nums, nums.length);
				for (int i = _nums.length - 1; i >= 0; i--) {
					while (_nums[i] != 0) {
						max += i * (int) Math.pow(10, fig);
						_nums[i]--;
						fig--;
					}
				}
				// min
				fig = L - 1;
				_nums = Arrays.copyOf(nums, nums.length);
				for (int i = 0; i < nums.length; i++) {
					while (_nums[i] != 0) {
						min += i * (int) Math.pow(10, fig);
						_nums[i]--;
						fig--;
					}
				}
				a = max - min;
				if (diff.containsKey(a)) {
					break;
				} else {
					diff.put(a, count);
				}
			}
			System.out.print(String.format("%d %d %d\n", diff.get(a), a, count - diff.get(a)));
		} //end while
	} //end main
}
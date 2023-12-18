import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = parseInt(br.readLine());
			}
			int find = parseInt(br.readLine()), count = 0;
			int min = 0, max = n - 1, mid;
			while (min <= max) {
				mid = (max - min) / 2 + min;
				count++;
				if (nums[mid] == find) {
					break;
				} else if (nums[mid] > find) {
					max = mid - 1;
				} else {
					min = mid + 1;
				}
			}
			System.out.println(count);
		}
	}
}
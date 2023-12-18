import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(in.readLine());
		if (range < 0 || Math.pow(10, 4) < range)
			throw new RuntimeException("error:range");
		String[] nums = new String[range];
		nums = in.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < range; i += 1) {
			for (int j = i + 1; j < range; j += 1) {
				if (Integer.parseInt(nums[i]) > Integer.parseInt(nums[j])) {
					String temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int m = 0; m < range; m += 1) {
			sum = sum(nums, sum, m);
		}
		String min = nums[0];
		String max = nums[range - 1];
		System.out.println(min + " " + max + " " + sum);
	}

	public static int sum(String[] nums, int sum, int i) {
		if (Integer.parseInt(nums[i]) < -Math.pow(10, 6)
					|| Math.pow(10, 6) < Integer.parseInt(nums[i]))
				throw new RuntimeException("error:nums");
		sum = sum + Integer.parseInt(nums[i]);
		return sum;
	}
}
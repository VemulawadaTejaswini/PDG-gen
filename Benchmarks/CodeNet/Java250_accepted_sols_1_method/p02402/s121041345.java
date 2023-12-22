import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(in.readLine());
		if (range < 0 || Math.pow(10, 4) < range)
			throw new RuntimeException("error:range");
		String[] nums = new String[range];
		nums = in.readLine().split(" ");
		int min = Integer.parseInt(nums[0]), max = Integer.parseInt(nums[0]);
		long sum = 0;
		for (int i = 0; i < range; i += 1) {
			max = Math.max(max, Integer.parseInt(nums[i]));
			min = Math.min(min, Integer.parseInt(nums[i]));
			if (Integer.parseInt(nums[i]) < -Math.pow(10, 6)
					|| Math.pow(10, 6) < Integer.parseInt(nums[i]))
				throw new RuntimeException("error:nums");
			sum = sum + Integer.parseInt(nums[i]);
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
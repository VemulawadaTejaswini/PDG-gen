import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int solve (String str) {
		int[] nums = new int[str.length()];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'M')
				nums[i] = 1000;
			else if (str.charAt(i) == 'D')
				nums[i] = 500;
			else if (str.charAt(i) == 'C')
				nums[i] = 100;
			else if (str.charAt(i) == 'L')
				nums[i] = 50;
			else if (str.charAt(i) == 'X')
				nums[i] = 10;
			else if (str.charAt(i) == 'V')
				nums[i] = 5;
			else if (str.charAt(i) == 'I')
				nums[i] = 1;
		}
//		System.out.println(Arrays.toString(nums));
		sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] < nums[i]) {
				sum -= nums[i - 1];
				sum += nums[i] - nums[i - 1];
			} else
				sum += nums[i];
//			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			System.out.println(solve(line));
			line = null;
		}

	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");
		long taka = Long.parseLong(nums[0]);
		long naka = Long.parseLong(nums[1]);
		long hiku = Long.parseLong(nums[2]);
		long k = Long.parseLong(nums[3]);

		long ans = 0;

		if (k % 2 == 0) {
			ans = taka - naka;

		} else {
			ans = naka - taka;
		}

		System.out.println(Math.pow(10, 18) < Math.abs(ans) ? "Unfair" : ans);

	}

}

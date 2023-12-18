import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			Arrays.sort(nums);
			System.out.println(nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2] ?
							   "YES" : "NO");
		}

	}

}
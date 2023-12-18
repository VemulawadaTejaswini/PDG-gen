import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		Arrays.sort(nums);
		int ans = nums[nums.length-1] - nums[0];
		System.out.println(ans);
		
		scanner.close();
	}

}

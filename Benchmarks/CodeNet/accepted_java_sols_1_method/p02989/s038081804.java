import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		int[] nums = new int[NUM];
		for (int i = 0; i < NUM; i++) {
			nums[i] = scan.nextInt();
		}

		// check
		Arrays.sort(nums);
		int answer = nums[NUM / 2] - nums[NUM / 2 - 1];

		// answer
		System.out.println(answer);

	}
}

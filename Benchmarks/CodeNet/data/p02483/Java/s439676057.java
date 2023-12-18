import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[3];

		for (int i = 0; i < nums.length; i++)
			nums[i] = sc.nextInt();

		Arrays.sort(nums);

		System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

	}

}
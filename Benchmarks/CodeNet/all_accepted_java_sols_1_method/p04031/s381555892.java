import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] inputs = scanner.nextLine().split(" ");
		int[] nums = new int[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			nums[i] = Integer.parseInt(inputs[i]) + 100;
		}
		int ave = (int) ((double) Arrays.stream(nums).sum() / n + 0.5d);
		int sum = 0;
		for (int num: nums) {
			sum += (num - ave) * (num - ave);
		}
		System.out.println(sum);
	}
}

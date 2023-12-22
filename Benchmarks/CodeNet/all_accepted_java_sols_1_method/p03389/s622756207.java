import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;

		int nums[] = new int[3];
		nums[0] = A;
		nums[1] = B;
		nums[2] = C;
		Arrays.sort(nums);
		int tmp = (nums[2] - nums[1]) + (nums[2] - nums[0]);
		if (tmp % 2 == 0) {
			ans = tmp / 2;
		} else {
			ans = (tmp + 3) / 2;
		}

		System.out.println(ans);
	}
}

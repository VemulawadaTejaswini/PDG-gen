import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		long sum = 0;
		int max =0;
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
			max = Math.max(max, nums[i]);
		}

		int[] nums2 = Arrays.copyOf(nums, N);;
		Arrays.sort(nums2);
		int max2 = nums2[N-2];

		for (int i = 0; i < N; i++) {
			if (nums[i] != max) {
				System.out.println(max);
			} else {
				System.out.println(max2);
			}
		}


	}
}



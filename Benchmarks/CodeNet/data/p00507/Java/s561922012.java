import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);

		Arrays.sort(A);
		third_p(A);

	}

	private static void third_p(int[] a) {
		System.out.printf("%d", 10 * a[0] + a[3]);
	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}

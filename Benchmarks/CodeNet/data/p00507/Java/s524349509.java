import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);
		String[] A_str = new String[n];

		for (int i = 0; i < n; i++) {
			A_str[i] = Integer.toString(A[i]);
		}

		Arrays.sort(A);
		Arrays.sort(A_str);
		third_p(A, A_str);

	}

	private static void third_p(int[] a, String[] a_str) {
		if (a.length == 3) {
			System.out.printf("%s%d\n", a_str[1], a[0]);
		}else {
			System.out.printf("%s%d\n", a_str[2], a[0]);
		}

	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}


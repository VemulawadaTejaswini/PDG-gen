import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);
		Arrays.sort(A);
		cd(A);
	}

	private static void cd(int[] a) {
		boolean isCD = true;

		System.out.println(1);
		for (int i = 2; i <= a[0]; i++) {
			isCD = true;
			for (int j = 0; j < a.length; j++) {
				if ( a[j] % i > 0) {
					isCD = false;
					break;
				}

			}

			if ( isCD ) {
				System.out.println(i);
			}
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

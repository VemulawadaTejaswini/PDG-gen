import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		int tmpMax = Integer.MIN_VALUE;
		int tmpMin = nums[0];

		for (int i = 1; i < n; i++) {
			tmpMax = Math.max(tmpMax, nums[i] - tmpMin);
			tmpMin = Math.min(tmpMin, nums[i]);
		}

		System.out.println(tmpMax);
	}
}
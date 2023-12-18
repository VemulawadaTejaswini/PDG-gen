import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		int[] R = inpNum(t);

		int mp = maxProfit(R);
		System.out.println(mp);
		sc.close();
	}

	private static int maxProfit(int[] R) {
		int max_p = 0;

		for(int i = 0; i < R.length - 1; i++) {
			for(int j = i + 1; j < R.length; j++) {
				max_p = Math.max(max_p, R[j] - R[i]);
			}
		}
		return max_p;
	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}
}


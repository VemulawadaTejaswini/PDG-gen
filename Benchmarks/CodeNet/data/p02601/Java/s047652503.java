import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[3];
		boolean isSuccessFlg = false;
		for (int i = 0; i < 3; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int a = nums[0];
		for (int i = 0; i <= k; i++) {
			int b = (int) (nums[1] * Math.pow(2, i));
			int c = (int) (nums[2] * Math.pow(2, k - i));
			if (c > b && b > a) {
				isSuccessFlg = true;
				break;
			}
		}

		if (isSuccessFlg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
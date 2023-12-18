import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 5
		int k = sc.nextInt();	// 3
		sc.nextLine();
		BigDecimal sum = new BigDecimal(1);
		BigDecimal before = new BigDecimal(0);
		Integer[] nums = new Integer[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum.multiply(new BigDecimal(nums[i]));
			if (i == k - 1) {
				before = sum;
				sum = sum.divide(new BigDecimal(nums[i - k + 1]));
				continue;
			}
			if (i >= k) {
				// 4以上
				if (sum.compareTo(before) > 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				before = sum;
				sum = sum.divide(new BigDecimal(nums[i - k + 1]));
			}
		}
	}
}


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			// 縦線の数
			int w = sc.nextInt();
			// あみだのスタートライン
			int[] nums = new int[w];
			for (int i = 0; i < w; i++) {
				nums[i] = i + 1;
			}

			// 横線の数
			int n = sc.nextInt();

			// 横線を引く
			for (int i = 0; i < n; i++) {
				String[] input = sc.next().split(",");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);

				int work = nums[a - 1];
				nums[a - 1] = nums[b - 1];
				nums[b - 1] = work;
			}

			// 結果出力
			for (int result : nums) {
				System.out.println(result);
			}
		} finally {
			sc.close();
		}
	}
}
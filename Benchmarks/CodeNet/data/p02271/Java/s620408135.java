
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		int[] num = new int[n]; // 個数のリスト
		int[] S = new int[n];
		int s = 0; // 要素の合計
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
			s += num[i];
		}

		int q = scan.nextInt(); // つくりたい個数
		int[] num_q = new int[q]; // つくりたいリスト
		for (int j = 0; j < q; j++) {
			num_q[j] = scan.nextInt();
			if (solve(0, num_q[j], n, num)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
		scan.close();

	}

	private static boolean solve(int i, int m, int n, int[] A) { // i番目以降の要素でmがつくれるか
																	// true:作れる
																	// false:作れない
		boolean res;
		if (m == 0) { // 0だったら作れる
			return true;
		}
		if (i >= n) {
			return false;
		}
		res = solve(i + 1, m, n, A) || solve(i + 1, m - A[i], n, A);
		return res;
	}

}


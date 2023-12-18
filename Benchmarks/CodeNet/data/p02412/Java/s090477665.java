import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 数値n、合計値xの入力準備
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		// 合計値xの構成要素の3つの数num1、num2、num3を入れる配列をつくる
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 組み合わせの数を入れる答えの配列をつくる
		ArrayList<Integer> anser = new ArrayList<Integer>();

		// num1、num2、num3(1～nの中から重複なし)を配列に入れる
		int min = 1;

		while (true) {
			// 数値n、合計値xを入力
			n = sc.nextInt();
			x = sc.nextInt();

			// 入力終了
			if (n == 0 && x == 0) {
				// 組み合わせの数を表示する
				for (Integer ans : anser) {
					System.out.println(ans);
				}
				break;
			}

			for (int num1 = min; num1 <= n - 2; num1++) {
				for (int num2 = num1 + 1; num2 <= n - 1; num2++) {
					for (int num3 = num2 + 1; num3 <= n; num3++) {
						if (x == num1 + num2 + num3) {
							list.add(num1);
							list.add(num2);
							list.add(num3);
						}
					}
				}
			}

			// 組み合わせの数を答えの配列に入れる
			anser.add((list.size() / 3));

			// 3つの数の配列の中身を削除する
			list.clear();
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n, x;

	public static void main(String args[]) {

		// 組み合わせ数を記録するリスト
		ArrayList<Integer> CombinationsCount = new ArrayList<Integer>();
		// 入力と終了判定
		while (inputNums()) {
			CombinationsCount.add(SearchCombinations());
		}

		// 出力
		CombinationsCount.forEach(count -> System.out.println(count));

	}

	// 入力処理
	static boolean inputNums() {
		n = sc.nextInt();
		x = sc.nextInt();
		if (n == 0 && x == 0) {
			return false;
		} else {
			return true;
		}
	}

	// 組み合わせを探す
	static int SearchCombinations() {
		int a, // 1つ目の数
				b = 2, // 2つ目の数(ループの初期判定のために2で初期化)
				c = 3, // 3つ目の数(ループの初期判定のために3で初期化)
				count = 0; // 組み合わせ数
		for (a = 1; a < b; a++) { // aは最小値から徐々に+1していく

			for (b = a + 1; b < c; b++) { // bはa+1からc-1まで+1していく

				for (c = n; c > b; c--) { // cは最大値から徐々に-1していく

					if (a + b + c == x) { // a,b,cの合計がxかどうか

						count++; // 組み合わせが見つかったためカウントアップ
					}
				}
				c = n;
			}
		}
		return count;
	}

}


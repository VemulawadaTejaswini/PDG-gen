import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 中間試験m点、期末試験f点、再試験r点の入力準備
		Scanner sc = new Scanner(System.in);
		int m;
		int f;
		int r;
		// 成績を入れる配列をつくる
		ArrayList<String> list = new ArrayList<String>();

		// 入力値によって成績を判定
		while (true) {
			// 中間試験m点、期末試験f点、再試験r点の数値を取得
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

			// 中間試験と期末試験のいずれかを欠席した場合→F
			if ((m == -1 || f == -1) && (!(m == -1 && f == -1 && r == -1))) {
				list.add("F");

				// 中間試験と期末試験の合計が80点以上だった場合→A
			} else if ((m + f) >= 80) {
				list.add("A");

				// 中間試験と期末試験の合計が65点以上80点未満だった場合→B
			} else if ((65 <= (m + f)) && ((m + f) < 80)) {
				list.add("B");

				// 中間試験と期末試験の合計が50点以上65点未満だった場合→C
			} else if ((50 <= (m + f)) && ((m + f) < 65)) {
				list.add("C");

				// 中間試験と期末試験の合計が30点以上50点未満だった場合→D
				// ただし、再試験の点数が50点以上ならば成績はC
			} else if ((30 <= (m + f)) && ((m + f) < 50) && (!(r >= 50))) {
				list.add("D");
			} else if ((30 <= (m + f)) && ((m + f) < 50) && (r >= 50)) {
				list.add("C");

				// 中間試験と期末試験の合計点数が30点未満だった場合→F
			} else if (((m + f) < 30) && (!(m == -1 && f == -1 && r == -1))) {
				list.add("F");
			} else {
			}

			// 入力終了
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
		}

		// 成績を表示する
		for (String grade : list) {
			System.out.println(grade);
		}
	}
}


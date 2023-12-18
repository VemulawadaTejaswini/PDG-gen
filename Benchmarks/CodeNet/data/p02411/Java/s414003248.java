;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int center_test = 0;
		int end_test = 0;
		int re_test = 0;
		ArrayList<String> score = new ArrayList<String>();

		// テキスト入力
		Scanner sc = new Scanner(System.in);

		//
		while (sc.hasNext()) {

			//
			center_test = sc.nextInt();
			end_test = sc.nextInt();
			re_test = sc.nextInt();

			// 中間試験と期末試験の合計点
			int sum_center_end = (center_test + end_test);

			// 全てマイナス1の場合は出力へ
			if (center_test == -1 && end_test == -1 && re_test == -1) {
				break;
			}

			// 中間試験、期末試験のいずれかを欠席した場合成績は F。
			if (center_test == -1 || end_test == -1) {
				score.add("F");
			} else {
				// 中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
				if (sum_center_end >= 80) {
					score.add("A");
				}
				// 中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
				if (sum_center_end >= 65 && sum_center_end < 80) {
					score.add("B");
				}
				// 中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
				if (sum_center_end >= 50 && sum_center_end < 65) {
					score.add("C");
				}
				// 中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は
				// C。
				if (sum_center_end >= 30 && sum_center_end < 50) {
					if (re_test >= 50) {
						score.add("D");
					} else {
						score.add("E");
					}
				}
				// 中間試験と期末試験の合計点数が 30 未満ならば成績は F。
				if (sum_center_end < 30) {
					score.add("F");
				}
			}
		}

		// 出力
		for (String val : score) {
			System.out.println(val);
		}
	}

}
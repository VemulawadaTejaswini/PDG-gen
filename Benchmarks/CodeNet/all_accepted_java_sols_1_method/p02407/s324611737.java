

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力文字列を取得
		Scanner sc = new Scanner(System.in);

		// 配列を作る
		ArrayList<Integer> list = new ArrayList<Integer>();
		int index_max = sc.nextInt();

		// リストにテキスト入力文字を格納
		for (int i = 0; i < index_max; i++) {
			//
			list.add(sc.nextInt());
		}

		// 逆順に表示
		for (int index = index_max - 1; index >= 0; index--) {

			String number = list.get(index).toString();

			// 最後の数以外には空白を追加
			if (index != 0) {

				number = number + " ";
				System.out.print(number);
				// 最後の数は改行出力
			} else {
				//
				System.out.println(number);
			}
		}

	}
}
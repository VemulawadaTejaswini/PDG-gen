

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 初期処理
		Scanner sc = null;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int number = 0;

		// テキスト入力クラス
		sc = new Scanner(System.in);

		// do~while処理
		while (sc.hasNext()) {

			// 現在の入力値
			number = sc.nextInt();
			
			//0だったら抜ける
			if (number == 0)
				break;
			// 配列に追加
			array.add(number);

			// 入力結果が0になるまで入力
		}

		// 最後の配列を出力しないので、ループは配列の数より１回少ない
		for (int i = 0; i < array.size(); i++) {
			// 配列に格納されている結果を出力
			System.out.println("Case " + (i+1) + ": " + array.get(i));
		}
	}
}
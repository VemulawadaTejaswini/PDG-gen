import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//
		ArrayList<Integer> big_list = new ArrayList<Integer>();
		ArrayList<Integer> small_list = new ArrayList<Integer>();

		int big = 0;
		int small = 0;

		// テキスト入力
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 入力文字を取得
			int first = sc.nextInt();
			int second = sc.nextInt();

			//
			if (first == 0 && second == 0) {
				break;
			}

			// 小さい順に並べる
			if (first >= second) {
				//
				big = first;
				small = second;
			} else {
				big = second;
				small = first;
			}

			// リストに入れる
			big_list.add(big);
			small_list.add(small);
		}

		// ループ
		for (int i = 0; i < big_list.size(); i++)
			// 出力
			System.out.println(small_list.get(i) + " " + big_list.get(i));
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//入力を受け取るためのScanner型インスタンスscanner
		Scanner scanner = new Scanner(System.in);

		//価格を格納する変数
		int price = scanner.nextInt();
		//嫌いな数字の個数を格納する変数
		int numOfElements = scanner.nextInt();
		//嫌いな数字を格納する配列
		int[] dislikeNums = new int[numOfElements];

		//配列に格納
		for (int i = 0; i < dislikeNums.length; i++) {
			dislikeNums[i] = scanner.nextInt();
		}
		scanner.close(); //scannerに使用しているメモリを解放

		/*支払額の候補を1円ずつ増加させて、
		 条件を満たしているかどうか確認する*/
		boolean flag = false; //条件を満たしているかどうかを管理する変数
		String stringPay; //payをString型に変換したものを格納する変数
		ArrayList<Integer> payArray = new ArrayList<Integer>();// 支払予定額に使われている数字を格納するArrayList
		int pay = 0; //支払予定額を格納する変数

		updateLoop: //支払予定額を更新するループ
		for (pay = price;; pay++) {

			//flagの初期値を設定（支払予定額が条件に合致すると仮定する)
			flag = false;

			//payを分解して、配列payArrayに1文字ずつ格納する
			stringPay = String.valueOf(pay);//payを分解する準備として、int型をString型に変換する

			for (int i = 0; i < stringPay.length(); i++) {
				//char型をInt型に変換することで、Integer型のArrayListに格納する
				payArray.add(Character.digit(stringPay.charAt(i), 10));
			}

			detectLoop: //要素を照合するループ
			for (Integer dislikeNum : dislikeNums) {
				flag = payArray.contains(dislikeNum);
				/*もし支払予定額に嫌いな数字が含まれていたならば、
				照合ループを抜けて支払予定額を更新する*/
				if (flag == true) {
					break detectLoop;
				}
			}
			/*flagが更新されなかったら（支払予定額が条件に合致すれば）、
			ループを抜ける */
			if (flag == false) {
				break updateLoop;
			}
			payArray.clear(); //次のループに持ち越されないように、ArrayListの中身を空にする

		}
		System.out.println(pay);
	}

}
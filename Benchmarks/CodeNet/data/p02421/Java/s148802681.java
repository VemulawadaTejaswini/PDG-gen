import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int taroPoint = 0;
		int hanakoPoint = 0;

		// 互いに持っている手札の枚数(勝負回数)
		int hasCard = scan.nextInt();

		// 勝負ループ
		for (int battle = 0; battle < hasCard; battle++) {
			// 太郎と花子の手札を入力
			String taroHands = scan.next();
			String hanakoHands = scan.next();

			// 太郎と花子の手札のアルファベットを格納するchar型の変数
			int[] taroHand = new int[taroHands.length()];
			int[] hanakoHand = new int[hanakoHands.length()];

			// 太郎の手札の文字を一つずつ文字コード(数字)に変換して格納
			for (int storeTaro = 0; storeTaro < taroHands.length(); storeTaro++) {
				taroHand[storeTaro] = (int) taroHands.charAt(storeTaro);
			}
			// 花子の手札の文字を一つずつ文字コード(数字)に変換して格納
			for (int storeHanako = 0; storeHanako < hanakoHands.length(); storeHanako++) {
				hanakoHand[storeHanako] = (int) hanakoHands.charAt(storeHanako);
			}

			// 最大文字数100以下
			for (int check = 0; check < 100; check++) {
				// 太郎の手札の一文字の数値が花子より大きいとき
				if (taroHand[check] > hanakoHand[check]) {
					taroPoint += 3;
					break;
					// 花子の手札の一文字の数値が太郎より大きいとき
				} else if (taroHand[check] < hanakoHand[check]) {
					hanakoPoint += 3;
					break;
				}

				// 二人の手札の文字数が同じとき
				if (check + 1 == hanakoHands.length() && check + 1 == taroHands.length()) {
					taroPoint++;
					hanakoPoint++;
					break;
				}
				// 太郎の手札の文字数のほうが短いとき
				if (check + 1 == taroHands.length()) {
					hanakoPoint += 3;
					break;
				}
				// 花子の手札の文字数のほうが短いとき
				if (check + 1 == hanakoHands.length()) {
					taroPoint += 3;
					break;
				}
			}

		}
		System.out.println(taroPoint + " " + hanakoPoint);
		scan.close();
	}
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Card {
	// 数と色
	private int number;
	private String color;
	private boolean used;

	Card(int number, String color) {
		this.number = number;
		this.color = color;
		this.used = false;
	}

	// 数字のゲッター・セッター
	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	// 色のゲッター・セッター
	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	// 使用状況ゲッター・セッター
	boolean getUsed() {
		return used;
	}

	void setUsed(boolean used) {
		this.used = used;
	}
}

class Hand {
	// 手札には９枚のCard型のカードを持つ
	private Card hand1 = new Card(0, "");
	private Card hand2 = new Card(0, "");
	private Card hand3 = new Card(0, "");
	private Card hand4 = new Card(0, "");
	private Card hand5 = new Card(0, "");
	private Card hand6 = new Card(0, "");
	private Card hand7 = new Card(0, "");
	private Card hand8 = new Card(0, "");
	private Card hand9 = new Card(0, "");

	List<Card> cardList = new ArrayList<Card>();

	// コンストラクタ
	Hand(String lineOfNum, String lineOfColor) {

		// 文字列をString型にキャストし手札のカードに格納
		hand1.setColor(String.valueOf((lineOfColor.charAt(0))));
		hand2.setColor(String.valueOf((lineOfColor.charAt(2))));
		hand3.setColor(String.valueOf((lineOfColor.charAt(4))));
		hand4.setColor(String.valueOf((lineOfColor.charAt(6))));
		hand5.setColor(String.valueOf((lineOfColor.charAt(8))));
		hand6.setColor(String.valueOf((lineOfColor.charAt(10))));
		hand7.setColor(String.valueOf((lineOfColor.charAt(12))));
		hand8.setColor(String.valueOf((lineOfColor.charAt(14))));
		hand9.setColor(String.valueOf((lineOfColor.charAt(16))));

		// 文字列の数字をint型にキャストし手札のカードに格納
		hand1.setNumber((int) lineOfNum.charAt(0) - 48);
		hand2.setNumber((int) lineOfNum.charAt(2) - 48);
		hand3.setNumber((int) lineOfNum.charAt(4) - 48);
		hand4.setNumber((int) lineOfNum.charAt(6) - 48);
		hand5.setNumber((int) lineOfNum.charAt(8) - 48);
		hand6.setNumber((int) lineOfNum.charAt(10) - 48);
		hand7.setNumber((int) lineOfNum.charAt(12) - 48);
		hand8.setNumber((int) lineOfNum.charAt(14) - 48);
		hand9.setNumber((int) lineOfNum.charAt(16) - 48);

		// 手札をリストに格納
		cardList.add(hand1);
		cardList.add(hand2);
		cardList.add(hand3);
		cardList.add(hand4);
		cardList.add(hand5);
		cardList.add(hand6);
		cardList.add(hand7);
		cardList.add(hand8);
		cardList.add(hand9);
	}

	int checkVictory() {

		// 3組をチェック
		for (int set = 1; set < 4; set++) {
			top: for (int searchNum = 1; searchNum < 10; searchNum++) {
				for (int firstNum = 0; firstNum < 9; firstNum++) {
					// 1枚目に選んだカードが使用していないとき

					if (!cardList.get(firstNum).getUsed()) {

						// リストの頭から1と一致しているか順番にチェック
						if (cardList.get(firstNum).getNumber() == searchNum) {
							// 1つ目リストの数字が一致したとき、一致した数字＋１の値を持つリストの要素を探す
							for (int secondNum = 0; secondNum < 9; secondNum++) {

								// 2枚目に選んだカードが未使用かつ１枚目とは別のカード
								if (!cardList.get(secondNum).getUsed() && secondNum != firstNum) {

									// ３枚のセットが順子のとき
									if (cardList.get(secondNum).getNumber() == searchNum + 1 && cardList.get(firstNum)
											.getColor().equals(cardList.get(secondNum).getColor())) {

										// 2つのカードの色が同じかつ、数字が＋１差のとき
										for (int thirdNum = 0; thirdNum < 9; thirdNum++) {

											if (!cardList.get(thirdNum).getUsed() && thirdNum != firstNum
													&& thirdNum != secondNum) {
												// ３枚目は未使用
												// 3つのカードの色が同じで、順子のとき一組完成
												if (cardList.get(thirdNum).getNumber() == searchNum + 2
														&& cardList.get(firstNum).getColor()
																.equals(cardList.get(thirdNum).getColor())) {
													// 組み合わせで使った３枚を使用済みに
													cardList.get(firstNum).setUsed(true);
													cardList.get(secondNum).setUsed(true);
													cardList.get(thirdNum).setUsed(true);
													break top;

												}
											}
										}
										// 3枚のセットが刻子のとき
									} else if (cardList.get(secondNum).getNumber() == searchNum && cardList
											.get(firstNum).getColor().equals(cardList.get(secondNum).getColor())) {

										for (int thirdNum = 0; thirdNum < 9; thirdNum++) {
											// 3枚目が未使用かつ１枚目と２枚目のカードとは別
											if (!cardList.get(thirdNum).getUsed() && thirdNum != firstNum
													&& thirdNum != secondNum) {
												// 3枚目の色と数字がほか２枚と同じ時
												if (cardList.get(thirdNum).getNumber() == searchNum
														&& cardList.get(firstNum).getColor()
																.equals(cardList.get(thirdNum).getColor())) {
													// 組み合わせで使った３枚を使用済みに
													cardList.get(firstNum).setUsed(true);
													cardList.get(secondNum).setUsed(true);
													cardList.get(thirdNum).setUsed(true);
													break top;
												}
											}
										} // 二つ目のカード刻子のとき
									}
								}
							}
						}
					}
				}
			}

		}
		int countTF = 0;
		for (int checkTF = 0; checkTF < 9; checkTF++) {
			if (cardList.get(checkTF).getUsed()) {
				countTF++;
			}
		}
		if (countTF == 9) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 判定回数の入力
		int numberOfCheck = scan.nextInt();
		// nextIntの改行文字を空読み
			scan.nextLine();
		// 入力された判定回数分ループ
		for (int i = 0; i < numberOfCheck; i++) {


			// 入力されたすべての数字を文字列として取得
			String lineOfNum = scan.nextLine();
			// 入力されたすべての色を文字列として取得
			String lineOfColor = scan.nextLine();

			Hand hand = new Hand(lineOfNum, lineOfColor);
			// 勝利判定の処理
			System.out.println(hand.checkVictory());
		}

		scan.close();
	}
}


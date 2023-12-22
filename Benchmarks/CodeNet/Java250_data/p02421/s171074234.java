import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String Alpha = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String line1 = "";
		String line2 = "";
		int T_Score = 0; // 太郎の得点
		int H_Score = 0; // 花子の得点
		int win = 3; // 勝者のプラス得点
		int draw = 1; // 引き分けの場合のプラス得点
		String[] animal = new String[2]; // カードに書かれた動物の組(太郎のカード、花子のカード)
		int T_Value = 0; // カードの強さ(太郎)
		int H_Value = 0; // カードの強さ(花子)
		int n = 0; // それぞれのカードの数(勝負回数)
		int compare_length = 0;
		boolean judge_n = true;
		boolean judge_line = true;

		line1 = sc.nextLine();
		n = Integer.parseInt(line1);
		if (n < 0 || n > 1000) {
			judge_n = false;
		}

		if (judge_n == true) {

			out: for (int i = 0; i < n; i++) {
				line2 = sc.nextLine();

				if (line2.length() > 100) {
					judge_line = false;
					break out;
				}
				animal = line2.split(" ");
				if (animal[0].length() > animal[1].length()) {
					compare_length = animal[1].length();
				} else if (animal[1].length() > animal[0].length()) {
					compare_length = animal[0].length();
				} else {
					compare_length = animal[0].length(); // animal[1]でもよい
				}
				in: for (int k = 0; k < compare_length; k++) {
					T_Value = Alpha.indexOf("" + animal[0].charAt(k));
					H_Value = Alpha.indexOf("" + animal[1].charAt(k));

					// 始:各文字が小文字であるかのチェック
					if (T_Value == -1 || H_Value == -1) {
						judge_line = false; // 大文字が存在すれば、条件を満たしていないのでループから出る
						break out;
					}
					// 終:各文字が小文字であるかのチェック

					if (T_Value != H_Value) {
						if (T_Value > H_Value) {
							T_Score += win;
						} else {
							H_Score += win;
						}

						break in;
					} else {
						if (k == compare_length - 1) { // kの値がcompare_length-1までき手いるということはそれまでの文字がすべて同じであるということ
							if (animal[0].length() == animal[1].length()) {
								T_Score += draw;
								H_Score += draw;
							} else if (animal[0].length() > animal[1].length()) {
								T_Score += win;
							} else {
								H_Score += win;
							}
						}

					}
				}// in:forここまで
			}// out:forここまで

			if (judge_line == true) {
				System.out.println(T_Score + " " + H_Score);
			}
		}
	}
}


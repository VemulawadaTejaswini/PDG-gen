import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String UpperAlpha = "abcdefghijklmnopqrstuvwxyz";
		String W;
		String line;
		String[] T;
		int count_Empty = 0;
		boolean judge_W = true;
		boolean judge_T = true;
		int count_W = 0;

		// 始:Wの入力とチェック
		W = sc.nextLine();

		if (W.length() > 10) {
			judge_W = false;
		}

		if (judge_W == true) {
			out: for (int i = 0; i < W.length(); i++) {
				if (UpperAlpha.indexOf("" + W.charAt(i)) == -1) {
					judge_W = false;
					break out;
				}
			}
		}
		// 終:Wの入力とチェック

		if (judge_W == true) {

			// 始: T入力とチェック
			out: while (true) {
				line = sc.nextLine(); // 入力された文章Tの1行を受け取る
				if (line.equals("END_OF_TEXT")) { // END_OF_TEXTと入力されたら
					break out; // whileからでる→入力終了

				}
				T = (line.toLowerCase()).split(" ");
				count_Empty += T.length - 1; // Tは半角で区切って要素を格納しているので-1をすることで空白数となる

				if (line.length() - count_Empty > 1000) {
					judge_T = false;
					break out;

				}

				for (int j = 0; j < T.length; j++) {

					if (T[j].equals(W)) {
						count_W++;
					}

				}// in:forここまで
			}// out: while ここまで

			if (judge_T == true) {
				System.out.println(count_W);

			}

		}

	}
}


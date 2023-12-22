import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//単語Wの読み込み
		String W = sc.nextLine();

		int count = 0;//回数初期化

		//判定のループ
		while (true) {

			//判定用文章読み込み
			String T = sc.nextLine();

			//END_OF_TEXTで抜ける
			if (T.equals("END_OF_TEXT")) {
				break;
			}

			//取り込み文をスペースで区切って格納
			String[] t = T.split(" ");

			//配列の取り出し
			for (int i = 0; i < t.length; i++) {

				if (t[i].equalsIgnoreCase(W)) {
					count++;
				} else if (!t[i].equalsIgnoreCase(W)) {

				}

			}

		}

		//1文の中に何回単語が出るかの判定

		//出力
		System.out.println(count);
		sc.close();
	}

}

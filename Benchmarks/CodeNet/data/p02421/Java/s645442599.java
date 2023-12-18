import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//カードの数
		int card = sc.nextInt();

		//太郎ポイント　花子ポイント
		int tp = 0;
		int hp = 0;

		//ループ
		for (int i = 0; i < card; i++) {

			//カード名：太郎　花子
			String t = sc.next();
			String h = sc.next();

			//文字列の比較
			//引き分けの場合
			if (t.equals(h)) {
				tp = tp + 1;
				hp = hp + 1;
			}

			//太郎が勝ちの場合
			else if (t.compareTo(h) > 0) {
				tp = tp + 3;
			}

			//花子が勝ちの場合(その他)
			else {
				hp = hp + 3;
			}
		}

		System.out.println(tp + " " + hp);

		sc.close();
	}

}


import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//入力準備
		Scanner sc = new Scanner (System.in);

		while (true) {

			//a・op・bを入力
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			//opが？ならば終了
			if (op.equals("?")) {
				break;
			} else {

				//変数宣言
				int ans;

				//opを判定して計算
				if (op.equals("+")) {
					ans = a + b;
				} else if (op.equals("-")) {
					ans = a - b;
				} else if (op.equals("*")) {
					ans = a * b;
				} else {
					ans = a / b;
				}

				//出力
				System.out.println(ans);
			}
		}

	}

}
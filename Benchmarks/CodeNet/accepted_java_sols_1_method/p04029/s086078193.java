import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 * @author RisaTozawa
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * Atcorder 提出
	 * @return
	 *
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ninnzuu = sc.nextInt();

		int goukei = 0;

		/* 人数分だけ個数の合計を求める */
		for (int i = 1; i <= ninnzuu; i++) {

			goukei = goukei + i;
		}

		/* 合計をコンソールに表示する */
		System.out.println(goukei);

	}

}

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
		Scanner scanner = new Scanner(System.in);
		int tmpS = 0;
		int h = 0;
		int tmpM = 0;
		int m = 0;
		int s = 0;
		int division = 60;

		tmpS = scanner.nextInt();

		/* 秒 */
		s = tmpS % division;
		/* 分 */
		tmpM = tmpS / division;
		m = tmpM % 60;
		/* 時間 */
		h = tmpM / division;

		System.out.println(h + ":" + m + ":" + s);

	}
}


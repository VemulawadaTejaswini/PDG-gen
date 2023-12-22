import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yuki
 */
public class Main {

	/*** 利子 */
	private final static double INTEREST = 1.05;
	/*** 切り上げ額 */
	private final static double REVALUATION = 1000;
	/*** 借金 */
	private static int debt = 100000;
	/*** 文字型入力ストリーム（標準入力） */
	private static BufferedReader br;
	/*** 週 */
	private static int weekNum;

	/*** 初期化 */
	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * メインメソッド<br>
	 * 借金の残高を出力する
	 *
	 */
	public static void main(String[] args) throws IOException {

		weekNum = Integer.parseInt(br.readLine());	// 週を取得

		System.out.println(getTotalDept());	// 借金の残高の出力

	}

	/**
	 * 借金の残高を取得する 利子をかけた週の合計の借金を計算して返す
	 *
	 * @return 借金の残高
	 */
	private static int getTotalDept() {
		double debtTemp = debt / REVALUATION;
		for (; weekNum > 0; weekNum--) {
			debtTemp = Math.ceil(debtTemp * INTEREST); // 切り上げ
		}
		return (int) (debtTemp * REVALUATION);
	}

}
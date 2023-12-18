import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * 提出
	 *
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sen = 1000;
		int otsuri = 0;
		int kisuu = 0;
		int shiharai = 0;
		int ichiman = 10000;

		if (n <= sen) {
			otsuri = sen - n;
		} else {
			if (n == ichiman) {
				//何もしない

			} else {
				kisuu = n /sen;
				shiharai = kisuu * sen + sen;
				otsuri = shiharai - n;
			}
		}

		System.out.println(otsuri);



	}
}

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
		int waru =  0;

		if (n <= sen) {
			otsuri = sen - n;
		} else {
			if (n == ichiman) {
				//何もしない

			} else {
				waru = n % sen;
				kisuu = n /sen;
				if (waru != 0) {
					shiharai = kisuu * sen + sen;
					otsuri = shiharai - n;
				} else {
					shiharai = kisuu * sen ;
					otsuri = shiharai - n;			
				}
			}
		}

		System.out.println(otsuri);



	}
}

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
		Scanner scanner= new Scanner(System.in);
		String a = " ";
		boolean hanntei = false;


		a = scanner.next();
		hanntei = a.matches("[a-z]");


		/* hanntei の値がtrueの場合、小文字 */
		if (hanntei == true) {
			System.out.println("a") ;
		/* それ以外(hanntei の値がfalseの場合、大文字)*/
		} else {
			System.out.println("A") ;
		}
	}
}

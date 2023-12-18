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
		final String a = "a";
		final String e = "e";
		final String i = "i";
		final String o = "o";
		final String u = "u";

		String text = "";

		/* コンソールから文字を受け取る */
		text = scanner.nextLine();

		/* 母音かどうかを検査する */
		switch (text) {
			case a:
				System.out.println("vowel");
				break;

			case e:
				System.out.println("vowel");
				break;

			case i:
				System.out.println("vowel");
				break;

			case o:
				System.out.println("vowel");
				break;

			case u:
				System.out.println("vowel");
				break;

			default:
				System.out.println("consonant");
				break;
		}
	}
}

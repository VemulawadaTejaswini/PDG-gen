import java.io.IOException;
import java.util.Scanner;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		int max = Math.min(A, B);
		int min = (A+B) - N;

		if (min < 0) {
			System.out.println(max + " " + 0);
		}else {
			System.out.println(max + " " + min);
		}

	}
}


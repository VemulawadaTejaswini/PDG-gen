import java.util.ArrayList;
import java.util.Collections;
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
		int n = 0;
		int k = 0;
		int tmp = 0;
		int result = 0;
		ArrayList<Integer> nedan = new ArrayList<Integer>();


		n = scanner.nextInt();
		k = scanner.nextInt();

		for(int i = 0; i < n; i++) {
			tmp = scanner.nextInt();
			nedan.add(tmp);
		}
		Collections.sort(nedan);


		for (int j = 0; j < k; j++) {
			result = result + nedan.get(j);
		}

		System.out.println(result);
	}
}

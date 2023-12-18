import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String input;

	public static void main(String[] args) {

		// 合計を記録するリスト
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		// 入力および終了判定
		while (InputNum()) {
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				// 合計に加算(文字列のi番目の文字を数値にしている)
				sum += Character.getNumericValue(input.charAt(i));
			}
			sumList.add(sum);
		}
		// 出力
		sumList.forEach(i -> System.out.println(i));
	}

	// 入力および終了判定
	static boolean InputNum() {
		input = sc.nextLine();
		if (input.equals("0")) {
			return false;
		} else {
			return true;
		}
	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int X = scan.nextInt();

		//演算
		String result = "No";

		if (X >= 30) {
			result = "Yes";
		}
		//結果出力
		System.out.println(result);
	}
}

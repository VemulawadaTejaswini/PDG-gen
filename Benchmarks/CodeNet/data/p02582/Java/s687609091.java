import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		char[] S = scan.next().toCharArray();


		//演算
		int result = 0;

		for (int i = 0; i < 3; i++) {
			if (S[i] == 'R') {
				result++;
			}
		}

		if (result == 2 && S[1] == 'S') {
			result = 1;
		}

		//結果出力
			System.out.println(result);
	}
}

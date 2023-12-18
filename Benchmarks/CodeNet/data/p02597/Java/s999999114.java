import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		char[] c = scan.next().toCharArray();

		//演算
		int red = 0;
		for (int i = 0; i < N; i++) {
			if (c[i] == 'R') {
				red++;
			}
		}

		int count = 0;
		for (int i = 0; i < red; i++) {
			if (c[i] == 'W') {
				count++;
			}
		}

		//結果出力
		System.out.println(count);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int Max = 10000;
		int[] x = new int[Max];
		int n = 0; // xの要素数
		Scanner sc = new Scanner(System.in);
		int input = 100;
		boolean inputjudge = true; // 入力要素が範囲内に収まっているかを確認するための変数;

		for (int i = 0; i < x.length; i++) {
			input = sc.nextInt();
			if (input >= 1 && input <= 10000) {
				x[i] = input;
				n++;
			} else if (input == 0) {
				break;
			} else { // 入力された値が範囲外のとき
				inputjudge = false;
				break;
			}
		}

		if (inputjudge == true) {

			for (int i = 0; i < n; i++) {
				System.out.println("Case " + (i + 1) + ": " + x[i]);

			}
		}
	}

}


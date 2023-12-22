import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = "";
		String[] input_data = new String[3]; // 入力された中間、期末、再テストの得点を一時的にString型で格納する配列
		int MAX_DATA = 50;
		int data_count = 0;
		int m = 0; // 中間テストの得点
		int f = 0; // 期末テストの得点
		int r = 0; // 再テストの得点
		int sum = 0; // 中間テストと期末テストの合計の得点
		boolean judge = true; // 入力されたデータが条件範囲内に収まっているかを判定するための変数

		String[] output = new String[MAX_DATA];

		out: for (int i = 0; i < MAX_DATA; i++) {
			input = sc.nextLine();
			input_data = input.split(" ");
			sum = 0;
			m = Integer.parseInt(input_data[0]);
			f = Integer.parseInt(input_data[1]);
			r = Integer.parseInt(input_data[2]);

			// 入力の終わりを示しているのかのチェック
			if (m == -1 && f == -1 && r == -1) {
				break out;
			}

			// 中間試験の得点が条件範囲内に収まっているかのチェック
			if (m < -1 && m > 50) {
				judge = false;
				break out;
			}

			// 期末試験の得点が条件範囲内に収まっているかのチェック
			if (f < -1 && f > 50) {
				judge = false;
				break out;
			}

			// 再試験の得点が条件範囲内に収まっているかのチェック
			if (r < -1 && r > 100) {
				judge = false;
				break out;
			}
			data_count++; // 入力値に問題がなければデータを1つカウントする

			// 成績の判定
			sum = m + f;
			if (m == -1 || f == -1) {
				output[i] = "F";
			} else if (sum >= 80) {
				output[i] = "A";
			} else if ((sum >= 65 && sum < 80)) {
				output[i] = "B";
			} else if (sum >= 50 && sum < 65) {
				output[i] = "C";
			} else if (sum >= 30 && sum < 50) {
				output[i] = "D";
				if (r >= 50) {
					output[i] = "C";
				}

			} else {
				output[i] = "F";
			}

		} // out: for文ここまで
		if (judge == true) {
			for (int j = 0; j < data_count; j++) {
				System.out.println(output[j]);

			}
		}

	}
}


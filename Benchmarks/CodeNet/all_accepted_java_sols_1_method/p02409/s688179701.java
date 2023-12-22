import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String input_number = ""; // 入力数
		String input_string = "";
		int n = 0; // 入力数を数値に変換するための変数
		Scanner sc = new Scanner(System.in);
		int[][][] school_data = new int[4][3][10]; // 大学の各棟の各階の各フロアの人数情報
													// ex)[0][2][5]→1棟の3階の6番目の部屋の人数
		String split_Line = "####################";
		String[] array_input = new String[4];
		int tenant = 0; // 棟の番号
		int floor = 0; // 何階かを示す変数
		int room = 0; // 部屋の番号
		int people = 0; // 各部屋にいる人の人数
		boolean judge = true; // 入力された値が条件範囲内かどうかを判定するときに使う変数
		String output_school_data = "";

		input_number = sc.nextLine();
		n = Integer.parseInt(input_number);

		out: for (int i = 0; i < n; i++) {
			input_string = sc.nextLine();
			array_input = input_string.split(" ");
			tenant = Integer.parseInt(array_input[0]);
			floor = Integer.parseInt(array_input[1]);
			room = Integer.parseInt(array_input[2]);
			people = Integer.parseInt(array_input[3]);

			if ((tenant < 1 || tenant > 4)
					|| (floor < 1 || floor > 13)
					|| (room < 1 || room > 10)
					|| (school_data[tenant - 1][floor - 1][room - 1] < 0 || school_data[tenant - 1][floor - 1][room - 1] > 9)) {
				judge = false;
				break out;
			}
			school_data[tenant - 1][floor - 1][room - 1] += people;

		}

		if (judge == true) {
			for (int j = 0; j < school_data.length; j++) { // 棟
				for (int k = 0; k < school_data[0].length; k++) {// 階
					output_school_data = "";
					for (int m = 0; m < school_data[0][0].length; m++) {// 部屋
						output_school_data += " " + school_data[j][k][m];
					}
					System.out.println(output_school_data);
				}
				if (j != school_data.length - 1) {
					System.out.println(split_Line);
				}
			}
		}

	}
}


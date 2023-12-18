import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int Max = 1000;
		int[][] intdata = new int[Max][3]; // 計算に使われる2つの整数の値と計算結果を格納するための配列
		String input = "";
		String[] inputdata = new String[3]; // 入力されたデータを半角スペースで区切って格納するための配列
		String[] opdata = new String[Max]; // 計算に使われる2つの整数の値を計算するための演算子を格納するための配列
		boolean judge = true; // 入力されたデータが条件を満たしているかを判定するための変数
		int n = 0; // データセットの数を示す変数 ex) 「2 + 3 」で1つのデータセット

		out: for (int i = 0; i <= intdata.length; i++) {
			input = sc.nextLine();
			inputdata = input.split(" ");
			intdata[i][0] = Integer.parseInt(inputdata[0]);
			opdata[i] = inputdata[1];
			intdata[i][1] = Integer.parseInt(inputdata[2]);

			if ((intdata[i][0] < 0 || intdata[i][0] > 20000)
					|| (intdata[i][1] < 0 || intdata[i][1] > 20000)) {
				judge = false;
				break out;
			}
			if ((intdata[i][1] == 0) && (opdata[i]).equals("/")) {
				judge = false;
				break out;
			}

			if ((opdata[i]).equals("+")) {
				intdata[i][2] = intdata[i][0] + intdata[i][1];
				n++;
			} else if ((opdata[i]).equals("-")) {
				intdata[i][2] = intdata[i][0] - intdata[i][1];
				n++;

			} else if ((opdata[i]).equals("*")) {
				intdata[i][2] = intdata[i][0] * intdata[i][1];
				n++;
			} else if ((opdata[i]).equals("/")) {
				intdata[i][2] = intdata[i][0] / intdata[i][1];
				n++;
			}

			else if ((opdata[i]).equals("?")) {
				break out;
			} else {
				judge = false;
				break out;
			}

		}

		if (judge == true) {
			for (int i = 0; i < n; i++) {
				System.out.println(intdata[i][2]);

			}
		}
	}
}


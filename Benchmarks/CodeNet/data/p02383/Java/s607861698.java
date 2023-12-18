import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 6桁の数字を受け取る配列diceを作る
		int[] dice = new int[6];
		// 6回処理を繰り返す
		for (int i = 0; i < 6; i++) {
			//受け取った数字を配列に入れる
			dice[i] = sc.nextInt();
		}

		DICE insdice = new DICE(dice);
		// 命令の文字列を受け取る
		String mei = sc.next();
		// 受け取った文字列の長さの回数処理を繰り返す
		for (int i = 0; i < mei.length(); i++) {

			insdice.roll(mei);

		}
		//結果表示
		insdice.print();
	}
	public static class DICE {
		//6面分の配列を作る
		int[] dice = new int[6];

		DICE(int[] dice) {

			this.dice = dice;

		}

		public void roll(String mei) {
			//命令の回数だけ処理を繰り返す
			for (int i = 0; i < mei.length(); i++) {
				//受け取った文字列を配列に入れる
				char[] Roll = mei.toCharArray();
				//文字列が一致した場合それぞれの処理に移る
				if (Roll[i] == 'S') {
					south();
				}
				if (Roll[i] == 'N') {
					north();
				}
				if (Roll[i] == 'W') {
					west();
				}
				if (Roll[i] == 'E') {
					east();
				}
			}
		}

		//配列DICEの中身を入れ替える
		private void south() {

			int irekae = dice[0];
			dice[0] = dice[4];
			dice[4] = dice[5];
			dice[5] = dice[1];
			dice[1] = irekae;

		}

		private void north() {
			int irekae = dice[0];
			dice[0] = dice[1];
			dice[1] = dice[5];
			dice[5] = dice[4];
			dice[4] = irekae;
		}

		private void east() {
			int irekae = dice[0];
			dice[0] = dice[3];
			dice[3] = dice[5];
			dice[5] = dice[2];
			dice[2] = irekae;
		}

		private void west() {
			int irekae = dice[0];
			dice[0] = dice[2];
			dice[2] = dice[5];
			dice[5] = dice[3];
			dice[3] = irekae;
		}


		//結果表示
		public void print() {
			System.out.println(dice[0]);
		}
	}

}
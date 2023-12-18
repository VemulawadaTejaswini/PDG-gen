import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ラベル入力・ダイスの生成
		Dice dice = new Dice(CreateIntLabel(sc.nextLine().split("[\\s]+")));

		// 回転方向入力・ラベル更新
		String[] input = sc.nextLine().split("");
		for (String str : input) {
			dice.Rotation(str);
		}
		sc.close();

		// 出力
		System.out.println(dice.label[0]);

	}

	// ラベル配列の生成
	public static int[] CreateIntLabel(String[] input) {
		int[] label = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			label[i] = Integer.parseInt(input[i]);
		}
		return label;
	}

	static class Dice {
		// 回転方向と方向に対応する変更面の添え字配列
		enum DiceStructure {
			Roll	(new int[] { 0, 1, 5, 4 }),
			Pitch	(new int[] { 0, 3, 5, 2 });
			//Yaw		(new int[] { 4, 2, 1, 3 });

			private int[] rotat;

			DiceStructure(int[] nums) {
				this.rotat = nums;
			}
		}

		enum Direction {
			N,
			E,
			W,
			S;
		}

		// ラベル
		int[] label;

		// コンストラクタ
		Dice(int[] label) {
			this.label = label;
		}

		// 回転方向文字を受け取り、ラベル更新処理へ、変更面配列を渡す
		public void Rotation(String str) {
			switch(Direction.valueOf(str)) {
			case N:
				LabelUpdate(DiceStructure.Roll.rotat);
				break;
			case E:
				LabelUpdate(DiceStructure.Pitch.rotat);
				break;
			case W:
				LabelUpdate(turnOver(DiceStructure.Pitch.rotat));
				break;
			case S:
				LabelUpdate(turnOver(DiceStructure.Roll.rotat));
				break;
			}
		}

		// 配列を逆順にして返す
		static int[] turnOver(int[] rotat) {
			int[] turnNums = new int[rotat.length];
			turnNums[0]=rotat[0];
			for (int i = 1; i < turnNums.length; i++) {
				turnNums[turnNums.length  - i] = rotat[i];
			}
			return turnNums;
		}

		// 変更面配列を受け取り、ラベル更新
		void LabelUpdate(int[] rotat) {
			int work = label[rotat[0]];
			for (int i = 1; i < rotat.length; i++) {
				label[rotat[i - 1]] = label[rotat[i]];
			}
			label[rotat[rotat.length - 1]] = work;
		}

	}
}


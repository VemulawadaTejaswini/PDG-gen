import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			int n = Integer.parseInt(str);
			int[] dicestate = { 1, 5, 4, 2, 3, 6, 0 };// up,north,west,south,east,down,score
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				if (str.equals("North")) {
					dicestate = North(dicestate);
				} else if (str.equals("East")) {
					dicestate = East(dicestate);
				} else if (str.equals("West")) {
					dicestate = West(dicestate);
				} else if (str.equals("South")) {
					dicestate = South(dicestate);
				} else if (str.equals("Right")) {
					dicestate = Right(dicestate);
				} else {
					dicestate = Left(dicestate);
				}
			}
			System.out.println(dicestate[6]+1);
			str = br.readLine();
		}
	}

	private static int[] North(int[] dice) {
		int temporary = dice[0];
		dice[0] = dice[3];
		dice[3] = dice[5];
		dice[5] = dice[1];
		dice[1] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}

	private static int[] East(int[] dice) {
		int temporary = dice[0];
		dice[0] = dice[2];
		dice[2] = dice[5];
		dice[5] = dice[4];
		dice[4] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}

	private static int[] South(int[] dice) {
		int temporary = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[3];
		dice[3] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}

	private static int[] West(int[] dice) {
		int temporary = dice[0];
		dice[0] = dice[4];
		dice[4] = dice[5];
		dice[5] = dice[2];
		dice[2] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}

	private static int[] Right(int[] dice) {
		int temporary = dice[1];
		dice[1] = dice[2];
		dice[2] = dice[3];
		dice[3] = dice[4];
		dice[4] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}

	private static int[] Left(int[] dice) {
		int temporary = dice[1];
		dice[1] = dice[4];
		dice[4] = dice[3];
		dice[3] = dice[2];
		dice[2] = temporary;
		dice[6] = dice[6] + dice[0];
		return dice;
	}
}
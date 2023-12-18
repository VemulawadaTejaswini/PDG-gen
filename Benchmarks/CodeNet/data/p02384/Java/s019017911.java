import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dice dice = new dice();
		String num[] = br.readLine().split("[\\s]+");

		for (int i = 0; i < num.length; i++) {
			dice.diceNum[i + 1] = Integer.parseInt(num[i]);
		}

		int diceCopy[] = new int[dice.diceNum.length];
		System.arraycopy(dice.diceNum, 0, diceCopy, 0, diceCopy.length);
		int questNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < questNum; i++) {
			String quest[] = br.readLine().split("[\\s]+");
			int syoumen = Integer.parseInt(quest[0]);
			int temae = Integer.parseInt(quest[1]);

			for (int j = 0; j < 3; j++) {
				if (syoumen == dice.diceNum[1]) {
					break;
				}
				dice.oderN();
			}

			for (int j = 0; j < 3; j++) {
				if (syoumen == dice.diceNum[1]) {
					break;
				}
				dice.oderW();
			}

			for (int j = 0; j < 3; j++) {
				if (temae == dice.diceNum[2]) {
					break;
				}
				dice.oderRoll();
			}
			System.out.println(dice.diceNum[3]);
		}
	}
}

class dice {
	int diceNum[] = new int[7];
	int stoc;

	public void oderN() {
		stoc = diceNum[1];
		diceNum[1] = diceNum[2];
		diceNum[2] = diceNum[6];
		diceNum[6] = diceNum[5];
		diceNum[5] = stoc;
	}

	public void oderW() {
		stoc = diceNum[1];
		diceNum[1] = diceNum[3];
		diceNum[3] = diceNum[6];
		diceNum[6] = diceNum[4];
		diceNum[4] = stoc;
	}

	public void oderRoll() {
		stoc = diceNum[2];
		diceNum[2] = diceNum[3];
		diceNum[3] = diceNum[5];
		diceNum[5] = diceNum[4];
		diceNum[4] = stoc;
	}
}

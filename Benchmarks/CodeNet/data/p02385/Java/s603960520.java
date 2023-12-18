import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice {
	public int[] value;
	public Dice(String[] info) {
		this.value = new int[6];
		for (int i = 0; i < value.length; i++) {
			this.value[i] = Integer.parseInt(info[i]);
		}
	}

	public int getTop( ) {
		return value[0];
	}

	public int getFront( ) {
		return value[1];
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dice dice1 = new Dice(br.readLine().split(" "));
		Dice dice2 = new Dice(br.readLine().split(" "));

		while (!isSameTop(dice1, dice2) && !isSameFront(dice1, dice2)) {
			rollingNorth(dice2);
		}
		if (isSameTop(dice1, dice2) == true
				&& isSameFront(dice1, dice2) == false) {
			for (int i = 0; i < 3; i++) {
				turn("S", dice2);
				if (isSameFront(dice1, dice2)) {
					break;
				}
			}
		} else if (isSameTop(dice1, dice2) == false
				&& isSameFront(dice1, dice2) == true) {
			for (int i = 0; i < 3; i++) {
				turn("V", dice2);
				if (isSameTop(dice1, dice2)) {
					break;
				}
			}
		} else if (!isSameTop(dice1, dice2) && !isSameFront(dice1, dice2)) {
			System.out.println("No");
		}
		if (isSameTop(dice1, dice2) && isSameFront(dice1, dice2)) {
			if (checkDice(dice1, dice2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

	private static void rollingNorth(Dice dice) {
		int work = dice.value[0];
		dice.value[0] = dice.value[1];
		dice.value[1] = dice.value[5];
		dice.value[5] = dice.value[4];
		dice.value[4] = work;
	}

	private static void turn(String direction, Dice dice) {
		int work = 0;;
		if (direction.equals("S")) {
			// ?????????????¨??????¢
			work = dice.value[1];
			dice.value[1] = dice.value[3];
			dice.value[3] = dice.value[4];
			dice.value[4] = dice.value[2];
			dice.value[2] = work;
		} else {
			// ????????????????????¢
			work = dice.value[0];
			dice.value[0] = dice.value[2];
			dice.value[2] = dice.value[5];
			dice.value[5] = dice.value[3];
			dice.value[3] = work;
		}
	}

	private static boolean isSameTop(Dice dice1, Dice dice2) {
		if (dice1.getTop() == dice2.getTop()) {
			return true;
		}
		return false;
	}

	private static boolean isSameFront(Dice dice1, Dice dice2) {
		if (dice1.getFront() == dice2.getFront()) {
			return true;
		}
		return false;
	}

	private static boolean checkDice(Dice dice1, Dice dice2) {
		for (int i = 2; i < dice1.value.length; i++) {
			if (dice1.value[i] != dice2.value[i]) {
				return false;
			}
		}
		return true;
	}
}
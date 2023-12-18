import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int numberOfDices;
		boolean sameDiceCheck = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		numberOfDices = Integer.parseInt(in.readLine());
		Dice dices[] = new Dice[numberOfDices];

		for (int i = 0; i < numberOfDices; i++) {
			dices[i] = new Dice();
			dices[i].createDice(in.readLine().split(" "));
		}

		for (int i = 0; i < numberOfDices; i++) {
			for (int j = i + 1; j < numberOfDices; j++) {
				sameDiceCheck = dices[i].check(dices[j]);
				if (sameDiceCheck) {
					break;
				}
			}
			if (sameDiceCheck) {
				break;
			}
		}
		if (sameDiceCheck) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}

class Dice {
	public Dice Dices[];

	public int on, tw, th, fo, fi, si;

	public Dice() {

	}

	public Dice(int on, int tw, int th, int fo, int fi, int si) {
		this.on = on;
		this.tw = tw;
		this.th = th;
		this.fo = fo;
		this.fi = fi;
		this.si = si;
	}

	void createDice(String[] data) {
		int[] diceNums = new int[6];
		for (int i = 0; i < data.length; i++) {
			diceNums[i] = Integer.parseInt(data[i]);
		}
		on = diceNums[0];
		tw = diceNums[1];
		th = diceNums[2];
		fo = diceNums[3];
		fi = diceNums[4];
		si = diceNums[5];
	}

	boolean check(Dice otherDice) {
		boolean result = false;
		int checkTimes = 0;

		while (checkTimes <= 29) {
			result = this.match(otherDice);
			if (result)
				break;
			checkTimes++;
			if (checkTimes == 5 || checkTimes == 15 || checkTimes == 25) {
				otherDice.north();
			} else if (checkTimes == 10 || checkTimes == 20) {
				otherDice.west();
			} else {
				otherDice.rightSpin();
			}
		}
		return result;
	}

	boolean match(Dice otherDice) {
		if (this.on == otherDice.on && this.tw == otherDice.tw
				&& this.th == otherDice.th && this.fo == otherDice.fo
				&& this.fi == otherDice.fi && this.si == otherDice.si) {
			return true;
		}
		return false;
	}

	void rightSpin() {
		int temp = tw;
		tw = fo;
		fo = fi;
		fi = th;
		th = temp;
	}

	public void north() {
		int temp = on;
		on = tw;
		tw = si;
		si = fi;
		fi = temp;
	}

	public void east() {
		int temp = on;
		on = fo;
		fo = si;
		si = th;
		th = temp;
	}

	public void west() {
		int temp = on;
		on = th;
		th = si;
		si = fo;
		fo = temp;
	}

	public void south() {
		int temp = on;
		on = fi;
		fi = si;
		si = tw;
		tw = temp;
	}
}
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

	public void rollingNorth() {
		int work = this.value[0];
		this.value[0] = this.value[1];
		this.value[1] = this.value[5];
		this.value[5] = this.value[4];
		this.value[4] = work;
	}

	public void turn(String direction) {
		int work = 0;;
		if (direction.equals("S")) {
			// ?????????????¨??????¢
			work = this.value[1];
			this.value[1] = this.value[3];
			this.value[3] = this.value[4];
			this.value[4] = this.value[2];
			this.value[2] = work;
		} else {
			// ????????????????????¢
			work = this.value[0];
			this.value[0] = this.value[2];
			this.value[2] = this.value[5];
			this.value[5] = this.value[3];
			this.value[3] = work;
		}
	}

	public boolean isMatch(Dice target) {
		for (int i = 1; i < this.value.length; i++) {
			if (this.value[i] != target.value[i]) {
				return false;
			}
		}
		return true;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dice dice1 = new Dice(br.readLine().split(" "));
		Dice dice2 = new Dice(br.readLine().split(" "));
		boolean isMatch = false;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (dice1.getTop() != dice2.getTop()) break;
				isMatch = dice1.isMatch(dice2);
				if (isMatch) break;
				dice2.turn("S");
			}
			if (isMatch) break;
			dice2.rollingNorth();
		}

		if (isMatch) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
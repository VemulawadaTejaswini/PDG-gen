import java.util.Scanner;

class Dice {
	private int[] d = new int[6];
	
	public void setDice(int index, int dnum) {
		this.d[index] = dnum;
	}
	
	void diceroll(String direction) {
		char[] dire = direction.toCharArray();
		for (char c : dire) {
			rool(c);
		}
	}
	
	void printDiceTop() {
		System.out.println(this.d[0]);
	}
	
	private void rool(char di) {
		int temp = 0;
		temp = this.d[0];
		if (di == 'E') {
			this.d[0] = this.d[3];
			this.d[3] = this.d[5];
			this.d[5] = this.d[2];
			this.d[2] = temp;
		} else if (di == 'W') {
			this.d[0] = this.d[2];
			this.d[2] = this.d[5];
			this.d[5] = this.d[3];
			this.d[3] = temp;
		} else if (di == 'S') {
			this.d[0] = this.d[4];
			this.d[4] = this.d[5];
			this.d[5] = this.d[1];
			this.d[1] = temp;
		} else if (di == 'N') {
			this.d[0] = this.d[1];
			this.d[1] = this.d[5];
			this.d[5] = this.d[4];
			this.d[4] = temp;
		} else;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		for (int i = 0; i < 6; i++) {
			dice.setDice(i, scan.nextInt());
		}
		dice.diceroll(scan.next());
		dice.printDiceTop();
	}
}
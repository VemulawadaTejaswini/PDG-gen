import java.util.Scanner;

class Dice {
	private int[] d = new int[6];
	
	public void setDice(int index, int dnum) {
		this.d[index] = dnum;
	}
	
	void diceroll(String direction) {
		char[] dire = direction.toCharArray();
		for (char c : dire) {
			this.rool(c);
		}
	}
	
	void printDiceTop() {
		System.out.println(this.d[0]);
	}
	
	void printDiceRight() {
		System.out.println(this.d[2]);
	}
	
	private void rool(char di) {
		int temp = this.d[0];
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
	
	public boolean setTop(int dnum) {
		for (int i = 0; i < this.d.length; i++) {
			if (dnum == this.d[i]) {
				if (i == 1) this.rool('N');
				if (i == 2) this.rool('W');
				if (i == 3) this.rool('E');
				if (i == 4) this.rool('S');
				if (i == 5) {
					this.rool('N');
					this.rool('N');
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean setCenter(int dnum) {
		int temp;
		int n = 0;
		for (int i = 1; i < 5; i++) {
			if (dnum == d[i]) {
				if (i == 1) n = 0;
				if (i == 2) n = 1;
				if (i == 4) n = 2;
				if (i == 3) n = 3;
				for (int j = 0; j < n; j++) {
					temp = this.d[1];
					this.d[1] = this.d[2];
					this.d[2] = this.d[4];
					this.d[4] = this.d[3];
					this.d[3] = temp;
				}
				return true;
			}
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		for (int i = 0; i < 6; i++) {
			dice.setDice(i, scan.nextInt());
		}
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			if (dice.setTop(scan.nextInt()))
				if (dice.setCenter(scan.nextInt()))
					dice.printDiceRight();
		}
	}
}
import java.util.Scanner;

class Dice {
	private int[] d = new int[6];
	
	public void setDice(int index, int dnum) {
		this.d[index] = dnum;
	}
	
	public int getDice(int index) {
		return this.d[index];
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
	
	boolean diceCheck(Dice dice) {
		for (int i = 0; i < 6; i++) {
			if (this.d[0] == dice.getDice(i)) {
				if (dice.setTop(dice.getDice(i))) {
					if (dice.setCenter(this.d[1])) {
						for (int j = 2; j < 6; j++) {
							if (this.d[j] != dice.getDice(j))
								return false;
							if (this.d[j] == dice.getDice(j) && j == 5) {
								return true;
							}
						}
					} else return false;
				} else return false;
			}
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice[] = new Dice[2];
		for (int i = 0; i < 2; i++) {
			dice[i] = new Dice();
			for (int j = 0; j < 6; j++)
				dice[i].setDice(j, scan.nextInt());
		}
		if (dice[0].diceCheck(dice[1])) {
			System.out.println("Yes");
		} else System.out.println("No");
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num1 = new int[6];
		int[] num2 = new int[6];
		for (int i = 0; i < 6; i++) {
			num1[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			num2[i] = sc.nextInt();
		}
		Dice dice1 = new Dice(num1);
		if (dice1.compare(num2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}

class Dice {

	private int face[] = new int[6];

	Dice(int[] num) {
		for (int i = 0; i < 6; i++) {
			this.face[i] = num[i];
		}
	}

	public void order(String str) {
		char[] order = str.toCharArray();
		for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case 'N':
				rollToNorth();
				break;
			case 'S':
				rollToSouth();
				break;
			case 'E':
				rollToEast();
				break;
			case 'W':
				rollToWest();
				break;
			}
		}
	}

	public int[] right(int q, int[] top, int[] front) {
		int[] result = new int[q];
		for (int i = 0; i < q; i++) {
			if (top[i] == this.face[0]) {

			} else if (top[i] == this.face[1]) {
				rollToNorth();
			} else if (top[i] == this.face[2]) {
				rollToWest();
			} else if (top[i] == this.face[3]) {
				rollToEast();
			} else if (top[i] == this.face[4]) {
				rollToSouth();
			} else if (top[i] == this.face[5]) {
				rollToNorth();
				rollToNorth();
			}
			if (front[i] == this.face[0]) {

			} else if (front[i] == this.face[1]) {

			} else if (front[i] == this.face[2]) {
				turnClockwise();
			} else if (front[i] == this.face[3]) {
				turnAnticlockwise();
			} else if (front[i] == this.face[4]) {
				turnClockwise();
				turnClockwise();
			} else if (front[i] == this.face[5]) {

			}
			result[i] = this.face[2];
		}
		return result;
	}

	public boolean compare(int[] dice) {
		boolean flag = true;
		if (dice[0] == this.face[0]) {

		} else if (dice[0] == this.face[1]) {
			rollToNorth();
		} else if (dice[0] == this.face[2]) {
			rollToWest();
		} else if (dice[0] == this.face[3]) {
			rollToEast();
		} else if (dice[0] == this.face[4]) {
			rollToSouth();
		} else if (dice[0] == this.face[5]) {
			rollToNorth();
			rollToNorth();
		}
		if (dice[1] == this.face[0]) {

		} else if (dice[1] == this.face[1]) {

		} else if (dice[1] == this.face[2]) {
			turnClockwise();
		} else if (dice[1] == this.face[3]) {
			turnAnticlockwise();
		} else if (dice[1] == this.face[4]) {
			turnClockwise();
			turnClockwise();
		} else if (dice[1] == this.face[5]) {

		}
		if (this.face[2] != dice[2]) {
			flag = false;
		}
		return flag;
	}

	public void rollToNorth() {
		int tmp;
		tmp = face[0];
		face[0] = face[1];
		face[1] = face[5];
		face[5] = face[4];
		face[4] = tmp;
	}

	public void rollToSouth() {
		int tmp;
		tmp = face[0];
		face[0] = face[4];
		face[4] = face[5];
		face[5] = face[1];
		face[1] = tmp;
	}

	public void rollToEast() {
		int tmp;
		tmp = face[0];
		face[0] = face[3];
		face[3] = face[5];
		face[5] = face[2];
		face[2] = tmp;
	}

	public void rollToWest() {
		int tmp;
		tmp = face[0];
		face[0] = face[2];
		face[2] = face[5];
		face[5] = face[3];
		face[3] = tmp;
	}

	public void turnClockwise() {
		int tmp;
		tmp = face[1];
		face[1] = face[2];
		face[2] = face[4];
		face[4] = face[3];
		face[3] = tmp;
	}

	public void turnAnticlockwise() {
		int tmp;
		tmp = face[1];
		face[1] = face[3];
		face[3] = face[4];
		face[4] = face[2];
		face[2] = tmp;
	}

	public int getFace(int index) {
		return face[index];
	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Dice d1 = new Dice(num);
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Dice d2 = new Dice(num);

		if (isEqualDice(d1, d2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//		d1.printDice();
//		d2.printDice();
	}

	static boolean isEqualDice(Dice d1, Dice d2) {
		while (true) {
			if (d1.num[0] == d2.num[0]) {
				break;
			}
			if (d1.num[0] == d2.num[1]) {
				d2.rollNorth();
			} else if (d1.num[0] == d2.num[2]) {
				d2.rollWest();
			} else if (d1.num[0] == d2.num[3]) {
				d2.rollEast();
			} else if (d1.num[0] == d2.num[4]) {
				d2.rollSouth();
			} else if (d1.num[0] == d2.num[5]) {
				d2.rollSouth();
				d2.rollSouth();
			} else {
				return false;
			}
		}

		for (int i = 0; i <= 4; i++) {
			if (i == 4) {
				return false;
			}
			if (d1.num[1] == d1.num[1]) {
				break;
			}
			d2.rollLeft();
		}

		if (d1.num[2] == d2.num[2]) {
			return true;
		} else {
			return false;
		}
	}
}

class Dice {
	int num[];
	int temp;

	public Dice(int num[]) {
		this.num = num;
	}

	void printDice() {

		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

	void printDiceSide(int upSide, int frontSide) {
		while (true) {
			if (upSide == num[0] && frontSide == num[1]) {
				break;
			}

			if (upSide == num[1]) {
				rollSouth();
			} else if (upSide == num[2]) {
				rollEast();
			} else if (upSide == num[3]) {
				rollWest();
			} else if (upSide == num[4]) {
				rollNorth();
			} else if (upSide == num[5]) {
				rollSouth();
				rollSouth();
			}
			if (frontSide == num[2]) {
				rollRight();
			} else if (frontSide == num[3]) {
				rollLeft();
			} else if (frontSide == num[4]) {
				rollRight();
				rollRight();
			}
		}
		System.out.println(num[2]);
	}

	void rollWest() {
		temp = num[0];
		num[0] = num[2];
		num[2] = num[5];
		num[5] = num[3];
		num[3] = temp;
	}

	void rollNorth() {
		temp = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = num[4];
		num[4] = temp;
	}

	void rollEast() {
		temp = num[0];
		num[0] = num[3];
		num[3] = num[5];
		num[5] = num[2];
		num[2] = temp;
	}

	void rollSouth() {
		temp = num[0];
		num[0] = num[4];
		num[4] = num[5];
		num[5] = num[1];
		num[1] = temp;
	}

	void rollRight() {
		temp = num[1];
		num[1] = num[3];
		num[3] = num[4];
		num[4] = num[2];
		num[2] = temp;
	}

	void rollLeft() {
		temp = num[1];
		num[1] = num[2];
		num[2] = num[4];
		num[4] = num[3];
		num[3] = temp;
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		int upSide, frontSide;
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Dice d = new Dice(num);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			upSide = sc.nextInt();
			frontSide = sc.nextInt();
			d.printDiceSide(upSide, frontSide);
		}

	}
}

class Dice {
	int num[];
	int temp;

	public Dice(int num[]) {
		this.num = num;
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
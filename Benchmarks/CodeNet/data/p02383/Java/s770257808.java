
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Dice d = new Dice(num);
		String order = sc.next();
		for (int i = 0; i < order.length(); i++) {
			switch (order.charAt(i)) {
			case 'W':
				d.rollWest();
				break;
			case 'N':
				d.rollNorth();
				break;
			case 'E':
				d.rollEast();
				break;
			case 'S':
				d.rollSouth();
				break;

			}
		}
		d.printLabel();
	}

}

class Dice {
	int num[];
	int temp;

	public Dice(int num[]) {
		this.num = num;
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

	void printLabel() {
		System.out.println(num[0]);
	}

}
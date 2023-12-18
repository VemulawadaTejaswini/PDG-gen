import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		Dice[] dz = new Dice[n];
		for (int i = 0; i < n; i++) {
			String[] labeldata = scan.nextLine().split(" ");
			dz[i] = new Dice(labeldata);
		}

		loop:
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if ( dicematch(dz[i], dz[j]) ) {
					System.out.println("No");
					break loop;
				}
			}
			if (i == n-2) {
				System.out.println("Yes");
				break loop;
			}
		}
	}

	static boolean dicematch(Dice d1, Dice d2) {
		int top;
		for (top = 0; top < 6; top++) {
			if ( d1.label[0].equals(d2.label[top]) ) break;
		}

		//System.out.println(top);

		switch (top) {
		case 0:
			break;
		case 1:
			d2.koroN();
			break;
		case 2:
			d2.koroW();
			break;
		case 3:
			d2.koroE();
			break;
		case 4:
			d2.koroS();
			break;
		case 5:
			d2.koroN().koroN();
			break;
		default:
			return false;
		}

		int front;
		for (front = 1; front <= 4; front++) {
			if ( d1.label[1].equals(d2.label[front]) ) break;
		}

		//System.out.println(front);

		switch (front) {
		case 1:
			break;
		case 2:
			d2.kaitenTokei();
			break;
		case 3:
			d2.kaitenHanTokei();
			break;
		case 4:
			d2.kaitenTokei().kaitenTokei();
			break;
		default:
			return false;
		}

		if ( d1.label[2].equals(d2.label[2]) &&
				d1.label[3].equals(d2.label[3]) &&
				d1.label[4].equals(d2.label[4]) &&
				d1.label[5].equals(d2.label[5]) ) {
			return true;
		} else {
			return false;
		}
	}
}

class Dice {
	String[] label;

	Dice(String[] labeldata) {
		label = new String[labeldata.length];

		for (int i = 0; i < labeldata.length; i++) {
			label[i] = labeldata[i];
		}
	}

	Dice koroN() {
		String temp;
		temp = label[0];
		label[0] = label[1];
		label[1] = label[5];
		label[5] = label[4];
		label[4] = temp;
		return this;
	}

	Dice koroS() {
		String temp;
		temp = label[0];
		label[0] = label[4];
		label[4] = label[5];
		label[5] = label[1];
		label[1] = temp;
		return this;
	}

	Dice koroE() {
		String temp;
		temp = label[0];
		label[0] = label[3];
		label[3] = label[5];
		label[5] = label[2];
		label[2] = temp;
		return this;
	}

	Dice koroW() {
		String temp;
		temp = label[0];
		label[0] = label[2];
		label[2] = label[5];
		label[5] = label[3];
		label[3] = temp;
		return this;
	}

	Dice kaitenTokei() {
		String temp;
		temp = label[1];
		label[1] = label[2];
		label[2] = label[4];
		label[4] = label[3];
		label[3] = temp;
		return this;
	}

	Dice kaitenHanTokei() {
		String temp;
		temp = label[1];
		label[1] = label[3];
		label[3] = label[4];
		label[4] = label[2];
		label[2] = temp;
		return this;
	}

}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		for (int i = 0; i < 6; i++) {
			dice1.setupDice(sc.nextInt());
		}
		for (int i = 0; i < 6; i++) {
			dice2.setupDice(sc.nextInt());
		}

		dice1.setTopMax();
		dice2.setTopMax();

		boolean isSameDice = false;
		for (int i = 0; i < 10; i++) {
			dice2.spin();
			if (dice1.getFace(2) == dice2.getFace(2)) {
				break;
			}
		}

		if (dice1.getFace(3) == dice2.getFace(3) &&
				dice1.getFace(4) == dice2.getFace(4) &&
				dice1.getFace(5) == dice2.getFace(5) &&
				dice1.getFace(6) == dice2.getFace(6)) {
			isSameDice = true;
		}

		if(isSameDice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

class Dice {
	List<Integer> faces;
	List<Integer> first;

	public Dice() {
		this.faces = new ArrayList<Integer>();
		faces.add(0);
		this.first = new ArrayList<Integer>();
		first.add(0);
	}

	public void setupDice(int value) {
		faces.add(value);
		first.add(value);
	}

	public void roll(int direction) {
		faces.set(0, faces.get(1));
		switch (faces.indexOf(direction)) {
		case 5:
			faces.set(1, faces.get(5));
			faces.set(5, faces.get(6));
			faces.set(6, faces.get(2));
			faces.set(2, faces.get(0));
			break;
		case 3:
			faces.set(1, faces.get(3));
			faces.set(3, faces.get(6));
			faces.set(6, faces.get(4));
			faces.set(4, faces.get(0));
			break;
		case 2:
			faces.set(1, faces.get(2));
			faces.set(2, faces.get(6));
			faces.set(6, faces.get(5));
			faces.set(5, faces.get(0));
			break;
		case 4:
			faces.set(1, faces.get(4));
			faces.set(4, faces.get(6));
			faces.set(6, faces.get(3));
			faces.set(3, faces.get(0));
			break;
		case 6:
			faces.set(1, faces.get(6));
			faces.set(6, faces.get(0));
			faces.set(0, faces.get(2));
			faces.set(2, faces.get(5));
			faces.set(5, faces.get(0));
			break;
		default:
			break;
		}
	}

	public void spin() {
		faces.set(0, faces.get(2));
		faces.set(2, faces.get(3));
		faces.set(3, faces.get(5));
		faces.set(5, faces.get(4));
		faces.set(4, faces.get(0));
	}

	public void setTopMax() {
		int max = 0;
		for (int i = 0; i <= 6; i++) {
			max = Math.max(max, faces.get(i));
		}
		this.roll(max);
	}

	public void setFront(int value) {
		while (faces.get(2) != value) {
			this.spin();
		}
	}

	public void reset() {
		for (int i = 1; i <= 6; i++) {
			faces.set(i, first.get(i));
		}
	}

	public int getFace(int face) {
		return faces.get(face);
	}

}


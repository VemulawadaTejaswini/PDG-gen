import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();

		for (int i = 1; i <= 6; i++) {
			dice.setFace(sc.nextInt());
		}

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			dice.roll(sc.nextInt());
			dice.setFront(sc.nextInt());
			System.out.println(dice.getFace(3));
			dice.reset();
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

	public void setFace(Integer value) {
		faces.add(value);
		first.add(value);
	}

	public void roll(int direction) {
		faces.set(0, faces.get(1));
		switch (faces.indexOf(direction)) {
		case 'S':
		case 5:
			faces.set(1, faces.get(5));
			faces.set(5, faces.get(6));
			faces.set(6, faces.get(2));
			faces.set(2, faces.get(0));
			break;
		case 'W':
		case 3:
			faces.set(1, faces.get(4));
			faces.set(3, faces.get(6));
			faces.set(6, faces.get(4));
			faces.set(4, faces.get(0));
			break;
		case 'N':
		case 2:
			faces.set(1, faces.get(2));
			faces.set(2, faces.get(6));
			faces.set(6, faces.get(5));
			faces.set(5, faces.get(0));
			break;
		case 'E':
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
		default :
		    break;
		}
	}
	
	public void spin(){
		    faces.set(0, faces.get(2));
			faces.set(2, faces.get(3));
			faces.set(3, faces.get(5));
			faces.set(5, faces.get(4));
			faces.set(4, faces.get(0));
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

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dice d1 = new Dice();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int[] i = ArrconvAtoi(s);

		char[] commands = sc.nextLine().toCharArray();

		d1.setFace(i);

			for (char c : commands) {
				d1.roll(c);
			}

		System.out.println(d1.getTop());
	}

	private static int[] ArrconvAtoi(String s) {
		String[] strs = s.split(" ");
		int[] ints = new int[strs.length];
		int i = 0;

		for (String st : strs) {
			ints[i] = Integer.parseInt(st);
			i++;
		}

		return ints;
	}
}


class Dice {
	final int F = 6;
	private int[] face;
	private int[] tmp;
	private int[] change = new int[F];

	Dice() {
		face = new int[F];
		tmp = new int[F];
	}

	public void roll(char c) {
		for (int i = 0; i < F; i++) {
			tmp[i] = face[i];
		}

		switch (c) {
		case 'N':
			change[0] = tmp[1];
			change[1] = tmp[5];
			change[2] = tmp[2];
			change[3] = tmp[3];
			change[4] = tmp[0];
			change[5] = tmp[4];
			break;
		case 'S':
			change[0] = tmp[4];
			change[1] = tmp[0];
			change[2] = tmp[2];
			change[3] = tmp[3];
			change[4] = tmp[5];
			change[5] = tmp[1];
			break;
		case 'E':
			change[0] = tmp[3];
			change[1] = tmp[1];
			change[2] = tmp[0];
			change[3] = tmp[5];
			change[4] = tmp[4];
			change[5] = tmp[2];
			break;
		case 'W':
			change[0] = tmp[2];
			change[1] = tmp[1];
			change[2] = tmp[5];
			change[3] = tmp[0];
			change[4] = tmp[4];
			change[5] = tmp[3];
			break;
		}

		setFace(change);

	}

	public int getTop() {
		return this.face[0];
	}

	public void setFace(int[] ints) {
		for (int i = 0; i < 6; i++) {
			this.face[i] = ints[i];
		}
	}

}


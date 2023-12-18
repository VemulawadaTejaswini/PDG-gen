import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] n = new int[6];
		for (int i = 0; i < 6; i++) {
			n[i] = in.nextInt();
		}
		Dice d = new Dice(n);

		String input = in.next();
		for (char c : input.toCharArray()) {
			if (c == 'N') {
				d.moveN();
			} else if (c == 'S') {
				d.moveS();
			} else if (c == 'E') {
				d.moveE();
			} else if (c == 'W') {
				d.moveW();
			}
		}
		out.println(d.getTop());
	}

	private static class Dice {
		private int[] no;
		Dice(int[] no) {
			if (no.length != 6) throw new RuntimeException();
			this.no = no;
		}
		private void moveX(boolean rev) {
			int temp = no[0];
			if (rev) {
				no[0] = no[4];
				no[4] = no[5];
				no[5] = no[1];
				no[1] = temp;
			} else {
				no[0] = no[1];
				no[1] = no[5];
				no[5] = no[4];
				no[4] = temp;
			}
		}
		void moveN(){moveX(false);}
		void moveS(){moveX(true);}

		private void moveY(boolean rev) {
			int temp = no[0];
			if (rev) {
				no[0] = no[3];
				no[3] = no[5];
				no[5] = no[2];
				no[2] = temp;
			} else {
				no[0] = no[2];
				no[2] = no[5];
				no[5] = no[3];
				no[3] = temp;
			}
		}
		void moveW(){moveY(false);}
		void moveE(){moveY(true);}

		int getTop(){return no[0];};
	}
}
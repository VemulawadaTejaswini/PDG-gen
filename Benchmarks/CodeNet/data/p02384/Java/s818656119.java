import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] m = new int[6];
		for (int i = 0; i < 6; i++) {
			m[i] = in.nextInt();
		}

		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			Dice d = new Dice(m);
			int a = in.nextInt();
			int b = in.nextInt();
			int[] n;

			boolean	match = false;
			for (int l = 0; l < 4; l++) {
				d.moveE();
				for (int j = 0; j < 4; j++) {
					d.moveN();
					for (int k = 0; k < 4; k++) {
						d.moveE();
						n = d.getNo();
						if (n[0] == a && n[1] == b) {
							match = true;
							break;
						}
					}
					if (match) break;
				}
				if (match) break;
			}

			n = d.getNo();
			out.println(n[2]);
		}
	}

	private static class Dice {
		private int[] no;
		Dice(int[] no) {
			if (no.length != 6) throw new RuntimeException();
			this.no = Arrays.copyOf(no, no.length);
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

		int[] getNo(){return Arrays.copyOf(no, no.length);};
	}
}
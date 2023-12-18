import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Dice dice1 = new Dice(sc.nextLine().split(" "));
			Dice dice2 = new Dice(sc.nextLine().split(" "));

			Boolean clear = false;
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (Arrays.equals(dice1.d, dice2.d)) {
							clear = true;
							break;
						}
						dice2.S();
					}
					dice2.E();
				}
				dice2.R();
			}
			if (!clear) {
		        System.out.println("No");
		    } else {
		        System.out.println("Yes");
		    }
		}
	}
	static class Dice{
		private int[] d = new int[6];

		public Dice(String[] d_num) {
			for(int i = 0;i < d.length;i++) {
				d[i] = Integer.parseInt(d_num[i]);
			}
		}

		public void N() {
		    int tmp = d[0];
		    d[0] = d[1];
		    d[1] = d[5];
		    d[5] = d[4];
		    d[4] = tmp;
		}

		public void E() {
		    int tmp = d[0];
		    d[0] = d[3];
		    d[3] = d[5];
		    d[5] = d[2];
		    d[2] = tmp;
		}

		public void W() {
		    int tmp = d[0];
		    d[0] = d[2];
		    d[2] = d[5];
		    d[5] = d[3];
		    d[3] = tmp;
		}

		public void S() {
		    int tmp = d[0];
		    d[0] = d[4];
		    d[4] = d[5];
		    d[5] = d[1];
		    d[1] = tmp;
		}
		public void R() {
			int tmp = d[1];
			d[1] = d[3];
			d[3] = d[4];
			d[4] = d[2];
			d[2] = tmp;
		}
	}
}


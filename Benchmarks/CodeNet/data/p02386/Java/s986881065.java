import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		ArrayList<int[]> D = new ArrayList<int[]>();

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			int[] kari = Dice.Diceget(line);
			D.add(kari);
		}
		
		int breakcount = 0;
		String answer = "Yes";

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (Dice.Dicejudge(D.get(i), D.get(j + i + 1))) {
					answer = "No";
					breakcount++;
					break;
				}
			}
			if (breakcount == 1) {
				break;
			}
		}
		
		System.out.println(answer);

	}
}

class Dice {
	public static int[] Diceget(String line) {
		int[] set = new int[7];
		String[] s = line.split(" ");
		for (int i = 1; i <= 6; i++) {
			set[i] = Integer.parseInt(s[i - 1]);
		}
		return set;
	}

	public static int[] DiceE(int[] d) {
		int[] dd = new int[7];
		dd[1] = d[4];
		dd[2] = d[2];
		dd[3] = d[1];
		dd[4] = d[6];
		dd[5] = d[5];
		dd[6] = d[3];
		return dd;
	}

	public static int[] DiceN(int[] d) {
		int[] dd = new int[7];
		dd[1] = d[2];
		dd[2] = d[6];
		dd[3] = d[3];
		dd[4] = d[4];
		dd[5] = d[1];
		dd[6] = d[5];
		return dd;
	}

	public static int[] DiceS(int[] d) {
		int[] dd = new int[7];
		dd[1] = d[5];
		dd[2] = d[1];
		dd[3] = d[3];
		dd[4] = d[4];
		dd[5] = d[6];
		dd[6] = d[2];
		return dd;
	}

	public static int[] DiceW(int[] d) {
		int[] dd = new int[7];
		dd[1] = d[3];
		dd[2] = d[2];
		dd[3] = d[6];
		dd[4] = d[1];
		dd[5] = d[5];
		dd[6] = d[4];
		return dd;
	}

	public static boolean Dicejudge(int[] d1, int[] d2) {
		
		boolean judge = false;

		int breakcount = 0;

		for (int j = 0; j < 4; j++) {

			for (int k = 0; k < 4; k++) {

				for (int l = 0; l < 4; l++) {

					for (int m = 0; m < 4; m++) {
						d2 = Dice.DiceW(d2);
						if (d1[1] == d2[1] && d1[2] == d2[2] && d1[3] == d2[3]
								&& d1[4] == d2[4] && d1[5] == d2[5]) {
							breakcount++;
							break;
						}

					}
					if (breakcount >= 1) {
						break;
					}
					d2 = Dice.DiceS(d2);
					if (d1[1] == d2[1] && d1[2] == d2[2] && d1[3] == d2[3]
							&& d1[4] == d2[4] && d1[5] == d2[5]) {
						breakcount++;
						break;

					}
				}

				if (breakcount >= 1) {
					break;
				}

				d2 = Dice.DiceE(d2);
				if (d1[1] == d2[1] && d1[2] == d2[2] && d1[3] == d2[3]
						&& d1[4] == d2[4] && d1[5] == d2[5]) {
					breakcount++;
					break;
				}

			}

			if (breakcount >= 1) {
				break;
			}

			d2 = Dice.DiceN(d2);
			if (d1[1] == d2[1] && d1[2] == d2[2] && d1[3] == d2[3]
					&& d1[4] == d2[4] && d1[5] == d2[5]) {
				breakcount++;
				break;
			}
		}
		
		if (breakcount == 1) {
			judge = true;
		}
		return judge;
	}
}
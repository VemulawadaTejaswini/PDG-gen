import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();

		int[] dice2 = Dice.Diceget(line1);

		String line2 = sc.nextLine();
		int q = Integer.parseInt(line2);

		String[] str = new String[q];
		for (int i = 0; i < q; i++) {
			str[i] = sc.nextLine();
		}

		for (int i = 0; i < q; i++) {
			int breakcount = 0;
			String[] sp = str[i].split(" ");
			int X = Integer.parseInt(sp[0]);
			int Y = Integer.parseInt(sp[1]);

			for (int j = 0; j < 4; j++) {
				
				for (int k = 0; k < 4; k++) {
								
					for (int l = 0; l < 4; l++) {
						dice2 = Dice.DiceS(dice2);
						if (dice2[1] == X && dice2[2] == Y) {
							System.out.println(dice2[3]);
							breakcount++;
							break;
						}
					}
					
					if (breakcount >= 1) {
						break;
					}					
					
					dice2 = Dice.DiceE(dice2);
					if (dice2[1] == X && dice2[2] == Y) {
						System.out.println(dice2[3]);
						breakcount++;
						break;
					}
				
				}
				
				if (breakcount >= 1) {
					break;
				}
				
				dice2 = Dice.DiceN(dice2);
				if (dice2[1] == X && dice2[2] == Y) {
					System.out.println(dice2[3]);
					break;
				}
			}

		}

	}

}

class Dice {
	public static int[] Diceget(String line) {
		int[] set = new int[7];
		String[] s = line.split(" ");
		for (int i = 1; i <= 6; i++) {
			set[i] = Integer.parseInt(s[i-1]);
		}
		return set;
	}

	public static int[] DiceE(int[] d){
		int[] dd = new int[7];
		dd[1] = d[4];
		dd[2] = d[2];
		dd[3] = d[1];
		dd[4] = d[6];
		dd[5] = d[5];
		dd[6] = d[3];
		return dd;
	}

	public static int[] DiceN(int[] d){
		int[] dd = new int[7];
		dd[1] = d[2];
		dd[2] = d[6];
		dd[3] = d[3];
		dd[4] = d[4];
		dd[5] = d[1];
		dd[6] = d[5];
		return dd;
	}

	public static int[] DiceS(int[] d){
		int[] dd = new int[7];
		dd[1] = d[5];
		dd[2] = d[1];
		dd[3] = d[3];
		dd[4] = d[4];
		dd[5] = d[6];
		dd[6] = d[2];
		return dd;
	}

	public static int[] DiceW(int[] d){
		int[] dd = new int[7];
		dd[1] = d[3];
		dd[2] = d[2];
		dd[3] = d[6];
		dd[4] = d[1];
		dd[5] = d[5];
		dd[6] = d[4];
		return dd;
	}
}
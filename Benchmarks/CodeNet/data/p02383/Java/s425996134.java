import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();

		int[] dice1 = Dice.Diceget(line1);

		String line2 = sc.nextLine();

		for (int i = 0; i < line2.length(); i++) {
			char c = line2.charAt(i);
			if (String.valueOf(c).equals("E")) {
				dice1 = Dice.DiceE(dice1);
			} else if (String.valueOf(c).equals("N")) {
				dice1 = Dice.DiceN(dice1);
			} else if (String.valueOf(c).equals("S")) {
				dice1 = Dice.DiceS(dice1);
			} else if (String.valueOf(c).equals("W")) {
				dice1 = Dice.DiceW(dice1);
			}

		}
		System.out.println(dice1[1]);

	}
}

public class Dice {
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
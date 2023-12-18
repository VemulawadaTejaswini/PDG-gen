import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int loop;
		String output = "Yes";
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			String line = sc.next();
			loop = Integer.parseInt(line);
			line = sc.nextLine();

			//?????????????????????
			int[][] diceList = new int[loop][6];
			for (int i = 0; i < loop; i++) {
				line = sc.nextLine();
				Dice di = new Dice(line);
				diceList[i] = di.surface;
				}
			//?????????????????¨????????????
			for (int i = 0; i < diceList.length - 1; i++) {
				for (int j = i + 1; j < diceList.length; j++) {
					//??????????????§??????
					if (Dice.diceCheck(diceList[i], diceList[j])) {
						output = "No";
						break;
					}
				}
			}
			System.out.println(output);
		} finally {
			sc.close();
		}
	}

}

//?????????????????????
class Dice{

	int[] surface;

	public Dice(String s){

		String[] work;

		work = s.split(" ");

		surface = new int[work.length];

		for (int i = 0; i < work.length; i++) {
			surface[i] = Integer.parseInt(work[i]);
		}
	}

	///????????????????????????????????????
	public static int[] diceroll(int[] di , String com){
		int n = 0;
		int[] dice = di;

		//???????????????
			switch (com) {
			case "N":
				n = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = n;
				break;

			case "S":
				n = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = n;
				break;

			case "W":
				n = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = n;
				break;

			case "E":
				n = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = n;
				break;

			default:
				System.out.println("other");
				break;
			}
		return dice;

	}

	///?????????????????????
	public static boolean diceCheck(int[] diceOne , int[] diceTwo){

		String command;

		boolean anser = false;
		for (int j = 0; j < 4; j++) {

			for (int k = 0; k < 4; k++) {
				if (!Arrays.equals(diceOne, diceTwo)) {
					command = "N";
					diceOne = Dice.diceroll(diceOne, command);
					command = "W";

					for (int l = 0; l < 4; l++) {
						diceOne = Dice.diceroll(diceOne, command);
						if (Arrays.equals(diceOne, diceTwo)) {
							anser = true;
							break;
						}
					}

				}else{
					anser = true;
					break;
				}
			}
			//
			if (!Arrays.equals(diceOne, diceTwo)) {
				command = "W";
				diceOne = Dice.diceroll(diceOne, command);
			}else{
				anser = true;
				break;
			}
		}
		return anser;

	}
}
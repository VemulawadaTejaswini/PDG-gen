import java .util.*;		
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		String[] diceNum = scan.nextLine().split(" ");
		String[] commands = scan.nextLine().split("");
		String[] copyDiceNum = new String[6];
		for(int i = 0; i < commands.length; i++ ) {

			switch(commands[i]) {

				case "N":
					System.arraycopy(diceNum , 0 ,copyDiceNum ,0 ,6);
					diceNum[0] = copyDiceNum[1];
					diceNum[1] = copyDiceNum[5];
					diceNum[2] = copyDiceNum[2];
					diceNum[3] = copyDiceNum[3];
					diceNum[4] = copyDiceNum[0];
					diceNum[5] = copyDiceNum[4];
				break;
				case "S":
					System.arraycopy(diceNum , 0 ,copyDiceNum ,0 ,6);
					diceNum[0] = copyDiceNum[4];
					diceNum[1] = copyDiceNum[0];
					diceNum[2] = copyDiceNum[2];
					diceNum[3] = copyDiceNum[3];
					diceNum[4] = copyDiceNum[5];
					diceNum[5] = copyDiceNum[1];
				break;
				case "W":
					System.arraycopy(diceNum , 0 ,copyDiceNum ,0 ,6);
					diceNum[0] = copyDiceNum[2];
					diceNum[1] = copyDiceNum[1];
					diceNum[2] = copyDiceNum[5];
					diceNum[3] = copyDiceNum[0];
					diceNum[4] = copyDiceNum[4];
					diceNum[5] = copyDiceNum[3];
				break;
				case "E":
					System.arraycopy(diceNum , 0 ,copyDiceNum ,0 ,6);
					diceNum[0] = copyDiceNum[3];
					diceNum[1] = copyDiceNum[1];
					diceNum[2] = copyDiceNum[0];
					diceNum[3] = copyDiceNum[5];
					diceNum[4] = copyDiceNum[4];
					diceNum[5] = copyDiceNum[2];
				break;
			}
		}
		System.out.println(diceNum[0]);
	}
}

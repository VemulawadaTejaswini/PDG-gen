import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int numN;
		String[] InputList = new String[2];
		String[][] Card = new String[4][13];
		String[] NumList;

		Scanner sc = null;

		//?????§????????¨??????????????????
		for (int i = 0; i < Card[0].length; i++) {
				Card[0][i] = "S" + (i + 1);
		}
		for (int i = 0; i < Card[0].length; i++) {
			Card[1][i] = "H" + (i + 1);
		}
		for (int i = 0; i < Card[0].length; i++) {
			Card[2][i] = "C" + (i + 1);
		}
		for (int i = 0; i < Card[0].length; i++) {
			Card[3][i] = "D" + (i + 1);
		}

		try {
			//??\????????????
			sc = new Scanner(System.in);
			numN = sc.nextInt();
			NumList = new String[numN];

			for (int i = 0; i < numN; i++) {

				for (int j = 0; j < InputList.length; j++) {
				//????????????????????????
					String s = sc.next();
					InputList[j] = s;
				}

				//???????????£??\
				NumList[i] = InputList[0] + InputList[1];
			}
			//?????¨??????????????§??????
			for (int i = 0; i < Card.length; i++) {
				for (int j = 0; j < Card[i].length; j++) {
					if(!Arrays.asList(NumList).contains(Card[i][j])){
						System.out.println(Card[i][j].substring(0, 1) + " " + Card[i][j].substring(1));
					}
				}
			}
			//System.out.println(Type);

		} finally {
			sc.close();
		}
	}

}
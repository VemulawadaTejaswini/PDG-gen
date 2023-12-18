

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// victory 1 defeat 0 save
		ArrayList<Integer> answer = new ArrayList<Integer>();

		// ???????????????????????°
		int set = Integer.parseInt(br.readLine());
		// input Area
		for (int i = 0; i < set; i++) {
			// ??¨??????????????????????????????????????????
			String tmpNum = br.readLine();
			String tmpColor = br.readLine();

			// ??°?????????????????§???????????£?¨????????????????????????????????????????????????????????´?
			CardRummy cr = new CardRummy(tmpNum, tmpColor);

			// method?????????????????????????????????
			int result = cr.playtheGame();
			// ???????????????????´?
			answer.add(result);

		}

		// output Area
		// ex : 10101010
		for (int i = 0; i < answer.size(); i++) {// debug chk point
			System.out.println(answer.get(i));
		}
	}
}// end

class CardRummy {

	// declear
	static final int ONECARDSET = 9;
	// static final int CARDPAGE = 2;

	int[] cardR = new int[ONECARDSET];
	int[] cardG = new int[ONECARDSET];
	int[] cardB = new int[ONECARDSET];

	public CardRummy() {
	}

	public CardRummy(String tmpNum, String tmpColor) {

		String[] transNum = tmpNum.split(" ");

		String[] transColor = tmpColor.split(" ");

		int intNum = 0;

		int tmpRnum = 0;

		int tmpGnum = 0;

		int tmpBnum = 0;

		// ???????±??????£???????????????????????¨????????????????´?
		for (int i = 0; i < ONECARDSET; i++) {// debug chk point

			if (transColor[i].equals("R")) {

				intNum = Integer.parseInt(transNum[i]);
				cardR[tmpRnum++] = intNum;

			} else if (transColor[i].equals("G")) {

				intNum = Integer.parseInt(transNum[i]);
				cardG[tmpGnum++] = intNum;

			} else if (transColor[i].equals("B")) {

				intNum = Integer.parseInt(transNum[i]);
				cardB[tmpBnum++] = intNum;
			}
		}
	}

	public int playtheGame() {// debug chk point
		int result = 0;

		// ??´???????\?
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		// ??£????????????????¢????
		cardR = sameNumCard(cardR);
		cardG = sameNumCard(cardG);
		cardB = sameNumCard(cardB);

		// ????????????????????????????¢????
		cardR = serialNumCard(cardR);
		cardG = serialNumCard(cardG);
		cardB = serialNumCard(cardB);

		// ?????????????????´???????\?
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		if (cardR[8] == 0 && cardG[8] == 0 && cardB[8] == 0) {

			result = 1;
		}

		return result;

	}

	public static int[] sameNumCard(int[] card) {// debug chk point

		// int tmpCnt =0;
		// int[] tmpSave = new int[ONECARDSET];

		for (int i = 0; i < 7; i++) {
			for (int j = i; j < 8; j++) {
				for (int k = j + 1; k < 9; k++) {

					if (card[i] == card[j] && card[j] == card[k]) {
						if (card[i] != 0 && card[i] == card[j] && card[i] == card[k]) {
							card[i] = 0;
							card[j] = 0;
							card[k] = 0;
						}
					}
				}
			}
		}
		return card;
	}

	public static int[] serialNumCard(int[] card) {// debug chk point

		for (int i = 0; i < 7; i++) {
			for (int j = i; j < 8; j++) {
				for (int k = j + 1; k < 9; k++) {

					if (card[i] == card[j] && card[j] == card[k]) {
						if (card[i] != 0 && card[i] == card[j] - 1 && card[i] == card[k] - 2) {
							card[i] = 0;
							card[j] = 0;
							card[k] = 0;

						}
					}
				}
			}
		}
		return card;
	}
}
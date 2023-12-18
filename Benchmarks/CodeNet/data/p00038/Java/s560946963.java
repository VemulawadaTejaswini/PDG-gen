import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	card = null;

		while ((card = parseCard()) != null) {
			judge(card);
		}
	}

	private static void judge(int[] card) {
		int[]	aCnt = {1, 0, 0, 0, 0};

		Arrays.sort(card);

		if (card[0] + 1 == card[1] && card[1] + 1 == card[2] && card[2] + 1 == card[3] && card[3] + 1 == card[4]) {
			System.out.println("straight");
			return;
		}

		if (card[0] == 1 && card[1] == 10 && card[2] == 11 && card[3] == 12 && card[4] == 13) {
			System.out.println("straight");
			return;
		}

		for(int nLoop = 0, nTmp = 0; nLoop < card.length - 1; nLoop++) {
			nTmp += (card[nLoop] == card[nLoop+1]) ? 0 : 1;
			aCnt[nTmp]++;
		}

		{
			int	nFourCard  = 0;
			int	nThreeCard = 0;
			int	nOnePair   = 0;

			for (int n = 0; n < aCnt.length && aCnt[n] != 0; n++) {
				if (aCnt[n] == 4) {
					nFourCard++;
				}

				if (aCnt[n] == 3) {
					nThreeCard++;
				}

				if (aCnt[n] == 2) {
					nOnePair++;
				}
			}

			if (nFourCard == 1) {
				System.out.println("four card");
			}
			else if (nThreeCard == 1) {
				if (nOnePair == 1) {
					System.out.println("full house");
				}
				else {
					System.out.println("three card");
				}
			}
			else if (nOnePair == 2) {
				System.out.println("two pair");
			}
			else if (nOnePair == 1) {
				System.out.println("one pair");
			}
			else {
				System.out.println("null");
			}
		}
	}

	private static int[] parseCard() {
		int[]	card  = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(",");
			card = new int[5];
			for (int n = 0; n < card.length; n++) {
				card[n] = Integer.parseInt(aN[n]);
			}
		}
		
		return card;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}
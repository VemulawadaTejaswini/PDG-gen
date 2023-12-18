import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static enum CardDesign {
		S(0), H(1), C(2), D(3);
		private int id;
		public int getId() {
			return this.id;
		}
		private CardDesign (int id) {
			this.id = id;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] checkInput = new boolean[4][13];
		int inputCards = Integer.parseInt(input.readLine());
		int inputNumberOfCards;

		for (int i = 0; i < inputCards; i++) {
			String[] inputCardsArray = (input.readLine()).split("\\s");
			inputNumberOfCards = Integer.parseInt(inputCardsArray[1]);
			switch(CardDesign.valueOf(inputCardsArray[0])) {
			case S:
				checkInput[0][(inputNumberOfCards -1)] = true;
				break;
			case H:
				checkInput[1][(inputNumberOfCards -1)] = true;
				break;
			case C:
				checkInput[2][(inputNumberOfCards -1)] = true;
				break;
			case D:
				checkInput[3][(inputNumberOfCards -1)] = true;
				break;
			}
		}

		for (int i = 0; i < CardDesign.values().length; i++) {
			for (int j = 0; j < checkInput[1].length; j++) {
				if (!checkInput[i][j]) {
					System.out.println(CardDesign.values()[i] + " " + (j +1));
				}
			}
		}
	}

}


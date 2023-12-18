import java.util.Scanner;

class Cards {
	
    private static final int SUIT = 4;
    private static final int NUMBER = 13;
    private static final int SPADE = 0;
    private static final int HEART = 1;
    private static final int CLUB = 2;
    private static final int DIAMOND = 3;
	
	private boolean[][] isExist;
	
	Cards() {
		isExist = new boolean[SUIT][NUMBER];
	}
	
	int convertSuitToInt(String suit) {
		if (suit.equals("S"))
			return SPADE;
		else if (suit.equals("H"))
			return HEART;
		else if (suit.equals("C"))
			return CLUB;
		else
			return DIAMOND;
	}
	String convertIntToSuit(int suit) {
		if (suit == SPADE)
			return "S ";
		else if (suit == HEART)
			return "H ";
		else if (suit == CLUB)
			return "C ";
		else
			return "D ";
	}
	
	void add(String suit, int num) {
		isExist[convertSuitToInt(suit)][num] = true;
	}
	
	void printNotExistCard() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < SUIT; ++i) {
			for (int j = 0; j < NUMBER; ++j) {
				if (!isExist[i][j]) {
					result.append(convertIntToSuit(i));
					result.append((j + 1) + "\n");
				}
			}
		}
		System.out.print(result);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data = 0;
		try {
			data = in.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Input Error.");
			System.exit(1);
		}
		
		String suit = null;
		int num = 0;
		Cards cards = new Cards();
		
		for (int i = 0; i < data; ++i) {
			try {
				suit = in.next();
				num = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			cards.add(suit, num - 1);
		}
		cards.printNotExistCard();
		in.close();
	}
}
import java.util.*;

class Cards {
	
	private static final int CARD_SUIT = 4;
	private static final int CARD_NUMBER = 13;
	private static final int SPADES = 0;
	private static final int HEARTS = 1;
	private static final int CLUBS = 2;
	private static final int DIAMONDS = 3;

	private boolean cards[][];
	
	public Cards(){
		cards = new boolean[CARD_SUIT][CARD_NUMBER];
	}

	public void setCard(String suit,int number){
		cards[parseSuitToInt(suit)][number - 1] = true;
	}

	public boolean isExistCard(String suit,int number){
		if(cards[parseSuitToInt(suit)][number - 1] == true){
			return true;
		} else {
			return false;
		}
	}
	
	public void printNotExistCards(){
		for (int i = 0; i < CARD_SUIT; i++){
			for (int j = 0; j < CARD_NUMBER; j++){
				if(cards[i][j] == false){
					System.out.println(parseIntToSuit(i) + " " + (j + 1));
				}
			}
		}
	}
	
	private String parseIntToSuit(int i){
		switch(i){
			case SPADES:
				return "S";
			case HEARTS:
				return "H";
			case CLUBS:
				return "C";
			case DIAMONDS:
				return "D";
		}
		return "";
	}
	
	private int parseSuitToInt(String suit){
		if(suit.equals("S")){
			return SPADES;
		} else if(suit.equals("H")){
			return HEARTS;
		} else if(suit.equals("C")){
			return CLUBS;
		} else if(suit.equals("D")){
			return DIAMONDS;
		}
		return -1;
	}
}

public class Main {
	public static void main(String[] args) {

		int n;
		
		Cards cd = new Cards();

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();

		for(int i = 0; i < n; i++){
			cd.setCard(sc.next(), sc.nextInt());
		}

		cd.printNotExistCards();
	}
}
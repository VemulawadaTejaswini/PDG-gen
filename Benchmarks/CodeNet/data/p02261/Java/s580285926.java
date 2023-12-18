
import java.util.Arrays;
import java.util.Scanner;
class Card {
	private String suit;
	private int number;
	
	Card(String suit, int number){
		this.suit = suit; this.number = number;
	}
	
	String getCard() { return suit + number;} 
	String getSuit() { return suit;}
	int getNum() { return number;}
	
	
	void setSuit(String suit) { this.suit = suit;}
	void setNum(int number) { this.number = number;}
	public String toString() {
		return this.suit + this.number;
	}
}

public class Main {
	
	//カードの並び替え前と後で同じ数字における絵柄の順序は変化していないかの判断
	static String stableJudge(Card[] bubble, Card[] selection) {
		for(int i = 0 ; i < bubble.length;i++) {
			if(!(bubble[i].getSuit().equals(selection[i].getSuit()))) {
				return "Not stable";
			}
		}
		return "Stable";
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		Card[] cardB = new Card [n];
		Card[] cardS = new Card [n];
		
		for(int i = 0; i < cardB.length; i++) {
			String m = stdIn.next();
			cardB[i] = new Card(m.substring(0, 1),Integer.valueOf(m.substring(1, 2)));
			cardS[i] = new Card(m.substring(0, 1),Integer.valueOf(m.substring(1, 2)));
		}

		
		//Bubble sort
				for(int i = 0; i < cardB.length; i++) {
					for(int j = cardB.length - 1; j - 1 >= i; j--) {
						if(cardB[j].getNum() < cardB[j - 1].getNum()){
						Card t  = cardB[j - 1];
						cardB[j - 1] = cardB[j];
						cardB[j] = t;
						}
					}
				}
				for(int i = 0; i < cardB.length - 1; i++) {
					System.out.print(cardB[i] + " ");
				}	System.out.println(cardB[cardB.length - 1]);
				System.out.println("Stable");
				
		//selection sort
				for(int i = 0 ; i < cardS.length; i++) {
					int minj = i;
					for(int j = i + 1; j < cardS.length; j++) {
						if(cardS[minj].getNum() > cardS[j].getNum()){
						minj = j;
						} 
					}
					Card s = cardS[i];
					cardS[i] = cardS[minj];
					cardS[minj] = s;
				}
				for(int i = 0; i < cardS.length - 1; i++) {
					System.out.print(cardS[i] + " ");
				}	System.out.println(cardS[cardS.length - 1]);
				System.out.println(stableJudge(cardB, cardS));
		}
}


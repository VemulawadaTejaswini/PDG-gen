import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	Map<Integer, Integer> number_of_cards;
	
	Main(int... cards){
		this.number_of_cards = new HashMap<Integer, Integer>();
		for(int c = 1; c <= 13; c++) this.number_of_cards.put(c, 0);
		for(int i: cards) this.number_of_cards.put(i, this.number_of_cards.get(i) + 1);
	}
	
	Poker judge() {
		//onepair, twopair, threecard, fourcard, fullhouse
		int num_pair = 0;
		int num_three = 0;
		int num_four = 0;
		for(Map.Entry<Integer, Integer> e: this.number_of_cards.entrySet()) {
			if(e.getValue() == 2) num_pair++;
			else if(e.getValue() == 3) num_three++;
			else if(e.getValue() == 4) num_four++;
		}
		
		//straight
		boolean straight = false;
		out: for(int c = 1; c <= 9; c++) {
			for(int i = c; i < c+5; i++) {
				if(this.number_of_cards.get(i) != 1) continue out;
			}
			straight = true;
			break;
		}
		
		//straight 10 J Q K A
		out: if(this.number_of_cards.get(1) == 1) {
			for(int c = 10; c <= 13; c++) {
				if(this.number_of_cards.get(c) != 1) break out;
			}
			straight = true;
		}
		
		//judge
		if(num_four == 1) return Poker.FOURCARDS;
		else if(num_three == 1 && num_pair == 1) return Poker.FULLHOUSE;
		else if(straight) return Poker.STRAIGHT;
		else if(num_three == 1) return Poker.THREECARDS;
		else if(num_pair == 2) return Poker.TWOPAIR;
		else if(num_pair == 1) return Poker.ONEPAIR;
		else return Poker.NULL;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner scstr = new Scanner(line);
			scstr.useDelimiter(",");
			
			int[] cards = new int[5];
			for(int i = 0; i < cards.length; i++) {
				cards[i] = scstr.nextInt();
			}
			scstr.close();
			
			System.out.println(new Main(cards).judge());
			scstr.close();
		}
		sc.close();
	}
	
}



enum Poker{
	NULL("null"), ONEPAIR("one pair"), TWOPAIR("two pair"), THREECARDS("three card"), 
	STRAIGHT("straight"), FULLHOUSE("full house"), FOURCARDS("four card");
	
	String name;
	
	public String toString() {
		return this.name;
	}
	
	Poker(String str) {
		this.name = str;
	}
}
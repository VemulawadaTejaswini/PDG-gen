
import java.util.*;

public class Main {
	static Set<Card> cards = new TreeSet<>();
	static {
		for(String suit : Card.suitRank.keySet()){
			for(int i = 1; i <= 13; i++){
				Card card = new Card(suit, i);
				cards.add(card);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Card card = new Card(sc.next(), sc.nextInt());
			cards.remove(card);
		}
		for(Card card : cards){
			System.out.println(card.suit + " " + card.num);
		}
	}
}
class Card implements Comparable{
	static Map<String, Integer> suitRank = new TreeMap<>();
	static{
		suitRank.put("S", 1);
		suitRank.put("H", 2);
		suitRank.put("C", 3);
		suitRank.put("D", 4);
	}
	String suit;
	int num;
	Card(String suit, int num){
		this.suit = suit;
		this.num = num;
	}
	String getSuit(){
		return this.suit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card card = ((Card) o);
		int ret = 0;
		Comparator<Card> comparator
				= Comparator.comparing((Card c) -> suitRank.get(c.getSuit()))
				.thenComparing(c -> c.num);
		return comparator.compare(this, card);
	}
}


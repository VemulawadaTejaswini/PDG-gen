import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static class Card implements Cloneable{
		public char suit;
		public char value;
		public Card() {}
		public Card(char suit, char value) {
			this.suit = suit; this.value = value;
		}
		public Card clone() {
			Card card = new Card();
			card.suit = this.suit; card.value = this.value;
			return card;
		}
	}
	public static void bubble(ArrayList<Card> A) {
		for(int i = 0; i < A.size(); i++) {
			for(int j = A.size() - 1; j >= 1; j--) {
				if(A.get(j).value < A.get(j-1).value) {
					Card t = A.get(j).clone(); A.set(j, A.get(j-1).clone()); A.set(j-1, t);
				}
			}
		}
	}
	public static void selection(ArrayList<Card> A) {
		for(int i = 0; i < A.size(); i++) {
			int minj = i;
			for(int j = i; j < A.size(); j++) {
				if(A.get(j).value < A.get(minj).value)minj =j;
			}
			Card t = A.get(i).clone(); A.set(i, A.get(minj).clone()); A.set(minj, t);
		}
	}
	public static void print(ArrayList<Card> A) {
		for(int i = 0; i < A.size(); i++) System.out.printf("%s%s%s",A.get(i).suit,A.get(i).value,i==A.size()-1?"\n":" ");
	}
	public static boolean isStable(ArrayList<Card> C1, ArrayList<Card> C2) {
		for(int i = 0; i < C1.size(); i++) {
			if(C1.get(i).suit != C2.get(i).suit) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = (int)scanner.nextLine().charAt(0);
		ArrayList<Card> C1 = new ArrayList<>(),C2 = new ArrayList<>();
		String[] str = scanner.nextLine().split(" ");
		for(String s : str) {
			C1.add(new Card(s.charAt(0), s.charAt(1)));
			C2.add(new Card(s.charAt(0),s.charAt(1)));
		}
		bubble(C1);
		selection(C2);
		print(C1);
		System.out.println("Stable");
		print(C2);
		if(isStable(C1,C2)) System.out.println("Stable");
		else System.out.println("Not stable");

		scanner.close();
	}
}

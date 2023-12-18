import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		Card[] src = new Card[n];
		Card[] cards = new Card[n];
		
    	for (int i = 0; i < n; i++) {
    		src[i] = new Card(sc.next());
    		cards[i] = src[i];
    	}
    	
    	// Bubble Sort
    	for (int i = 0; i < n; i++) {
    		for (int j = n - 1; j > i; j--) {
    			if (cards[j].rank < cards[j - 1].rank) {
    				Card temp = cards[j];
    				cards[j] = cards[j - 1];
    				cards[j - 1] = temp;
    			}
    		}
    	}
//    	printData(src);
    	printData(cards);
    	if (checkStable(src, cards)) {
    		System.out.println("Stable");
    	} else {
    		System.out.println("Not Stable");
    	}

    	for (int i = 0; i < n; i++) {
    		cards[i] = src[i];
    	}
//    	printData(src);
//    	printData(cards);

    	// SelectionSort
    	for (int i = 0; i < n; i++) {
    		int mini = i;
    		for (int j = i; j < n; j++) {
    			if (cards[j].rank < cards[mini].rank) {
    				mini = j;
    			}
    		}
    		if (mini != i) {
    			Card temp = cards[i];
    			cards[i] = cards[mini];
    			cards[mini] = temp;
    		}
    	}
//    	printData(src);
    	printData(cards);
    	if (checkStable(src, cards)) {
    		System.out.println("Stable");
    	} else {
    		System.out.println("Not Stable");
    	}

    	sc.close();
	}
	
	private static boolean checkStable(Card[] src, Card[] result) {
		for (int i = 1; i < result.length; i++) {
			if (result[i - 1].rank == result[i].rank) {
				if (seekCard(src, result[i - 1].data) > seekCard(src, result[i].data)) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static int seekCard(Card[] src, String key) {
		for (int i = 0; i < src.length; i++) {
			if (src[i].data.equals(key)) {
				return i;
			}
		}
		
		return -1;
	}

	private static void printData(Card[] data) {
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			printData.append(data[i].data);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);
	}
}

class Card {
	public String data;
	public int rank;
	public char suit;
	
	public Card(String str) {
		data = str;
		suit = str.charAt(0);
		rank = str.charAt(1) - '0';
	}
}
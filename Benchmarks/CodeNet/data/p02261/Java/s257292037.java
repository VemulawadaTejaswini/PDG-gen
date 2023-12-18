

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Card[] originalC = new Card[n];
		for(int i = 0; i < n; i++){
			String card = in.next();
			char suit = card.charAt(0);
			int num = Integer.parseInt(""+card.charAt(1));
			originalC[i] = new Card(suit, num);
		}
		Card[] c1 = new Card[n];
		copy(c1,originalC);
		Card[] bubbleC = bubbleSort(c1,n);
		printArray(bubbleC);
		System.out.println("Stable");	//bubbleSort???????????¨????????\???????????????
		Card[] c2 = new Card[n];
		copy(c2,originalC);
		Card[] selectionC = selectionSort(c2,n);
		printArray(selectionC);
		if(hikaku(bubbleC,selectionC)) System.out.println("Stable");
		else System.out.println("Not stable");
		in.close();
	}
	void copy(Card[] a, Card[]b){
		for(int i = 0; i < a.length; i++){
			a[i] = b[i];
		}
	}
	boolean hikaku(Card[] a, Card[] b){
		for(int i = 0; i < a.length; i++){
			if(a[i].suit != b[i].suit) return false;
		}
		return true;
	}
	Card[] bubbleSort(Card[] c, int n){
		for(int i = 0; i < n-1; i++){
			for(int j = n-1; j >= i+1; j--){
				if(c[j].num  < c[j-1].num){
					Card tmp = c[j];
					c[j] = c[j-1];
					c[j-1] = tmp;
				}
			}
		}
		return c;
	}
	Card[] selectionSort(Card[] c, int n){
		for(int i = 0; i < n; i++){
			int minj = i;
			for(int j = i; j < n;j++){
				if(c[j].num < c[minj].num) minj = j;
			}
			if(minj != i){
				Card tmp = c[i];
				c[i] = c[minj];
				c[minj] = tmp;
			}
		}
		return c;
	}
	void printArray(Card[] c){
		String s = c[0].toString();
		for(int i = 1; i < c.length; i++){
			s += " " + c[i];
		}
		System.out.println(s);
	}
}

class Card{
	char suit;
	int num;
	Card(char suit, int num){
		this.suit = suit;
		this.num = num;
	}
	public String toString(){
		return "" + suit + num;
	}
}
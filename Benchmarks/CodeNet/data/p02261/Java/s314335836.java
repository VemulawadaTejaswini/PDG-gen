import java.util.Scanner;

class Card{
	public int number;
	public char suit;
	
	public Card(String san){
		suit = san.charAt(0);
		number = Integer.parseInt(String.valueOf(san.charAt(1)));
	}
	public void printSuitAndNumber(){
		System.out.print(""+suit+number);
	}

	public String toString(){
		return (suit+String.valueOf(number));
	}
}
class Main{
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Card[] card1 = new Card[N];
		Card[] card2 = new Card[N];
		for(int i = 0;i<N;i++){
			card1[i] = new Card(in.next());
			card2[i] = card1[i];
		}
		bubbleSort(card1,N);
		selectionSort(card2,N);
		if(isStable(card1,card2,N)){
			System.out.println("Stable");
		}else{
			System.out.println("Not Stable");
		}
	}
	
	public static void bubbleSort(Card[] c,int n){
		for(int i = 0;i<n-1;i++){
			for(int j = n-1;j>i;j--){
				if(c[j].number<c[j-1].number){
					Card temp = c[j];
					c[j] = c[j-1];
					c[j-1] = temp;
				}
			}
		}
		for(int i = 0;i<n;i++){
			if(i>0)System.out.print(" ");
			c[i].printSuitAndNumber();
		}
		System.out.println("");
		System.out.println("Stable");
	}
	
	public static void selectionSort(Card[] c,int n){
		for(int i = 0;i<n-1;i++){
			int minj = i;
			for(int j = i+1;j<n;j++){
				if(c[minj].number>c[j].number){
					minj = j;
				}
			}
			Card temp = c[i];
			c[i] = c[minj];
			c[minj] =  temp;
		}
		for(int i = 0;i<n;i++){
			if(i>0)System.out.print(" ");
			c[i].printSuitAndNumber();
		}
		System.out.println("");
	}
	
	public static boolean isStable(Card[] C1, Card[] C2,int n){
		for(int i = 0;i<n;i++){
			if(C1[i] != C2[i]) return false;
		}
		return true;
	}
}
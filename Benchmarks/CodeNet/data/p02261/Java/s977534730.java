import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		Card[] sortListb = new Card[count];
		Card[] sortLists = new Card[count];
		for(int i = 0; i < count; i++){
			Card card = new Card(scanner.next());
			sortListb[i] = card;
			sortLists[i] = card;
		}
		bubbleSort(sortListb, count);
		selectionSort(sortLists, count);
		print(sortListb, count);
		System.out.println("Stable");
		print(sortLists, count);
		if(isStable(sortListb, sortLists, count)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}

	private static void bubbleSort(Card[] sortListb, int count){
		Card temp;
		for(int j = 0; j < count; j++){
			for(int i = count - 1; i > j; i--){
				if(sortListb[i].value < sortListb[i - 1].value){
					temp = sortListb[i];
					sortListb[i] = sortListb[i - 1];
					sortListb[i - 1] = temp;
				}
			}
		}
	}

	private static void selectionSort(Card[] sortLists, int count){
		int min;
		Card temp;
		for(int i = 0; i < count - 1; i++){
			min = i;
			for(int j = i; j < count; j++){
				if(sortLists[j].value < sortLists[min].value){
					min = j;
				}
			}
			temp = sortLists[i];
			sortLists[i] = sortLists[min];
			sortLists[min] = temp;
			if(min != i){
			}
		}
	}

	private static void print(Card[] list, int count){
		for(int i = 0; i < count; i++){
			if(i != count - 1){
				System.out.print(list[i] + " ");
			}else{
				System.out.println(list[i]);
			}
		}
	}

	private static boolean isStable(Card[] lista, Card[] listb, int count){
		for(int i = 0; i < count; i++){
			if(lista[i].suit != listb[i].suit){
				return false;
			}
		}
		return true;
	}

	private static class Card{
		private char suit;
		private int value;
		Card(String value) {
			suit = value.charAt(0);
			this.value = Integer.parseInt(String.valueOf(value.charAt(1)));
        }

        @Override
        public String toString() {
            return suit + String.valueOf(value);
        }
	}
}
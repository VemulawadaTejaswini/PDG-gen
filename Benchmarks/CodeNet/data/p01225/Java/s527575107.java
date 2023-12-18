import java.util.Scanner;
public class Main{
	public static class Card{
		String color;
		int num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, n;
		Card[] card = new Card[9];
		for(i = 0; i < 9; i++) card[i] = new Card();
		n = sc.nextInt();
		for(i = 0; i < n; i++){
			for(j = 0; j < 9; j++) card[j].num = sc.nextInt();
			for(j = 0; j < 9; j++) card[j].color = sc.next();
			
			System.out.println(cardCheck(card));
		}
	}
	public static int cardCheck(Card card[]) {
		int i;
		cardSort(card);
		for(i = 0; i < 9; i += 3){
				if(!(card[i].color.equals(card[i + 1].color) && card[i].color.equals(card[i + 2].color)))
					return 0;
				if(!((card[i].num == card[i + 1].num && card[i].num == card[i + 2].num) ||
					(card[i].num == card[i + 1].num - 1 && card[i].num == card[i + 2].num - 2)))
					return 0;
		}
		return 1;	
	}
	public static void cardSort(Card card[]) {
		int j, k;
		Card t = new Card();
		for(k = 9 - 1; k > 0; k--){
			for(j = 0; j < k; j++){
				if(card[j].num > card[j + 1].num){
					t = card[j];
					card[j] = card[j + 1];
					card[j + 1] = t;
				}
			}
		}
		for(k = 9 - 1; k > 0; k--){
			for(j = 0; j < k; j++){
				if(card[j].color.compareTo(card[j + 1].color) < 0){
					t = card[j];
					card[j] = card[j + 1];
					card[j + 1] = t;
				}
			}
		}
	}
}
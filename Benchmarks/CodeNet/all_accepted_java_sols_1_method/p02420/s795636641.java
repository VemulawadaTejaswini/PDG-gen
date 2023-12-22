import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String deck;
		int m,h;
		Scanner scan = new Scanner(System.in);
		while(true){
			deck=scan.next();
			if(deck.equals("-"))
				break;
			m=scan.nextInt();
			char[] cards = deck.toCharArray();
			char[] temp = new char[cards.length];
			for(int i=0;i<m;i++){
				h=scan.nextInt();
				for(int j=0;j<h;j++){
					temp[j]=cards[j];
				}
				for(int j=h;j<cards.length;j++){
					cards[j-h]=cards[j];
				}
				for(int j=0;j<h;j++){
					cards[j + (cards.length - h)] = temp[j];
				}
			}
			for(int i=0;i<cards.length;i++){
				System.out.print(cards[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}

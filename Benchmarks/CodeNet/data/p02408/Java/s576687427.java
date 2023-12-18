import java.text.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Card card = new Card();
		int kazu = scan.nextInt();
		String type ;
		int num;
		
		for(int i = 0; i < kazu; i++) {
			type = scan.next();
			num = scan.nextInt();
			card.setCard(type, num);
		}
		card.getNai();
	}
}

class Card {
	private boolean[][] tcard = new boolean[4][13];
	
	public void setCard (String c, int n) {
		int num = n - 1;
		int card = passType(c);
		tcard[card][num] = true;
	}
	public void getNai () {
		for(int i1 = 0;i1 < 4;i1++) {
			for(int i2 = 0;i2 < 13;i2++) {
				boolean t = tcard[i1][i2];
				if(t == false) {
					if(i1 == 0) {
						System.out.print('S');
					}else if(i1 == 1) {
						System.out.print('H');
					}else if(i1 == 2) {
						System.out.print('C');
					}else if(i1 == 3) {
						System.out.print('D');
					}
					int num = i2 + 1;
					System.out.println(" " +num); 
				}
			}
		}
	}
	private int passType (String type) {
		if(type.equals("S")) {
			return 0;
		}else if(type.equals("H")) {
			return 1;
		}else if(type.equals("C")) {
			return 2;
		}else { // if(type.equals("D")) {
			return 3;
		}
	}
}
import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Card card = new Card();
		int kazu = scan.nextInt();
		String[] type = new String[kazu];
		int[] num= new int[kazu];
		int i = 0;
		
		while(i != kazu) {
			type[i] = scan.next();
			num[i] = scan.nextInt();
			card.setCard(type[i], num[i]);
			i++;
		}
		card.getNai();
	}
}

class Card {
	private boolean[][] tcard = new boolean[4][13];

	Card () {
		
	}
	public void setCard (String c, int num) {
		int card = passType(c);
		tcard[card][num] = true;
		
	}
	public void getNai () {
		for(int i1 = 0;i1 < 4;i1++) {
			for(int i2 = 0;i1 < 13;i2++) {
				if(tcard.equals(false)) {
					if(i1 == 0) System.out.print('S');
					if(i1 == 1) System.out.print('H');
					if(i1 == 2) System.out.print('C');
					if(i1 == 3) System.out.print('D');
					int num = i2 + 1;
					System.out.println(" " +num); 
				}
			}
		}
	}
	private int passType (String type) {
		if(type == "S") return 0;
		if(type == "H") return 1;
		if(type == "C") return 2;
		if(type == "D") return 3;
		return 4;
	}
}
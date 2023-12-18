import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int cardsSize = scan.nextInt();
		boolean isStable = true;
		boolean boubleFlag = true;
		String[] cards = new String[cardsSize];
		for(int i = 0; i < cardsSize; i++) {
			cards[i] = scan.next();
		}
		String[] boubleCards = Arrays.copyOf(cards , cardsSize);
		String[] selectionCards = Arrays.copyOf(cards , cardsSize);

		//bouble
		while(boubleFlag) {
			boubleFlag = false;
			for(int n = cardsSize - 1; n > 0 ; n--) {
			String tmp = boubleCards[n];
				if(boubleCards[n].charAt(1) < boubleCards[n-1].charAt(1)) {
					boubleCards[n] = boubleCards[n-1];
					boubleCards[n-1] = tmp;
					boubleFlag = true;
				}
			}
		}



		//selectionSort
		for(int n = 0; n < cardsSize; n++) {
			int point = 0;
			String min = selectionCards[n];
			for(int j = n + 1; j < cardsSize; j++) {
				if(selectionCards[j].charAt(1) < min.charAt(1)) {
					min = selectionCards[j];
					point = j;
				}
			}
			if(min != selectionCards[n]) {
				selectionCards[point] = selectionCards[n];
				selectionCards[n] = min;
			}
		}


		for(int i = 0 ; i < cardsSize; i++) {
			System.out.print(boubleCards[i]);
			if(i != cardsSize-1){
				System.out.print(" ");
			} else {
				System.out.println();
		    }
		}
		System.out.println("Stable");


		for(int i = 0 ; i < cardsSize; i++) {
			System.out.print(selectionCards[i]);
			if(!(boubleCards[i].equals(selectionCards[i]))){
				isStable = false;
			}
			if(i != cardsSize-1){
				System.out.print(" ");
			} else {
				System.out.println();
		    }
		}
		if(isStable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
	    }
    }
}

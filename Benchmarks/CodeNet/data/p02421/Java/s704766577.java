import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int turn;
		int playerA = 0, playerB = 0;
		String card[][];
		
		turn = scan.nextInt();
		card = new String[turn][2];
		
		for (int i = 0; i < turn; turn++) {
			for( int j = 0; j < 2; j++) {
				card[i][j] = scan.next();
			}
			
			//判定
			if (card[i][0].compareTo(card[i][1]) == 1) {
				playerA += 3;
			} else if (card[i][0].compareTo(card[i][1]) == 0){
				playerA += 1;
				playerB += 1;
			} else {
				playerB += 3;
			}
		}
		
		scan.close();
		System.out.println (playerA + " " + playerB);
		
	}
}


import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int turn;
		int playerA = 0, playerB = 0;
		String playerAcard, playerBcard;
		
		turn = scan.nextInt();
		
		for (int i = 0; i < turn; i++) {
			
			playerAcard = scan.next();
			playerBcard = scan.next();
			
			//判定
			if (playerAcard.compareTo(playerBcard) > 0) {
				playerA += 3;
			} else if (playerAcard.compareTo(playerBcard) == 0){
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


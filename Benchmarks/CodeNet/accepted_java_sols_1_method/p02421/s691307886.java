import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String card1,card2;
		int player1=0,player2=0;

		for(int i = 0;i<n;i++) {
			card1 = sc.next();
			card2 = sc.next();

			if(card1.compareTo(card2) >= 1) {

				player1 += 3;

			}else if(card1.compareTo(card2) <= -1){

				player2 += 3;

			}else if(card1.compareTo(card2) == 0) {

				player1++;
				player2++;

			}

		}

		System.out.println(player1 + " " + player2);
		sc.close();

	}

}

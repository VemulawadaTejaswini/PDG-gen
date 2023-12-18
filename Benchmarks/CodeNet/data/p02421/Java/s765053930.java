import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int score1 = 0, score2 = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String card1 = scan.next();
			String card2 = scan.next();
			if(card1.compareTo(card2) > 0){
				score1 += 3;
			}else if(card1.compareTo(card2) == 0){
				score1 += 1;
				score2 += 1;
			}else{
				score2 += 3;
			}
		}
		scan.close();
		System.out.println(score1 + " " + score2);
	}
}
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score;
		int scoreA, scoreB;
		
		scoreA = 0;
		scoreB = 0;
		
		
		for(int i = 0; i < 4; i++){
			score = scan.nextInt();
			
			scoreA += score;
		}
		
		for(int i = 0; i < 4; i++){
			score = scan.nextInt();
			
			scoreB += score;
		}
		
		if(scoreA >= scoreB)System.out.println(scoreA);
		else System.out.println(scoreB);
	}
}
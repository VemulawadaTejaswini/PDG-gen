import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scoreA = 0;
		for (int i = 0; i < 4; i++){
			scoreA += sc.nextInt();
		}
		int scoreB = 0;
		for (int i = 0; i < 4; i++){
			scoreB += sc.nextInt();
		}
		if (scoreA >= scoreB){
			System.out.println(scoreA);
		}
		else {
			System.out.println(scoreB);
		}
	}

}


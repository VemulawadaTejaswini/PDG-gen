import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<String> blueCards = new ArrayList<>();
		Set<String> checkBlueCards = new HashSet<>();
 		for(int i = 0; i < N; i++) {
 			String tmp = sc.next();
			blueCards.add(tmp);
			checkBlueCards.add(tmp);
		}

		int M = Integer.parseInt(sc.next());
		ArrayList<String> redCards = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			redCards.add(sc.next());
		}
		sc.close();

		int score = Integer.MIN_VALUE;
		for(String tmp : checkBlueCards) {
			int tmpScore = 0;
			for(int i = 0; i < blueCards.size(); i++) {
	 			if(blueCards.get(i).equals(tmp)) {
	 				tmpScore++;
	 			}
			}

			for(int i = 0; i < redCards.size(); i++) {
	 			if(redCards.get(i).equals(tmp)) {
	 				tmpScore--;
	 			}
			}

			score = Math.max(score, tmpScore);
		}
		if(score > 0) {
			System.out.println(score);
		}else {
			System.out.println(0);
		}

	}

}
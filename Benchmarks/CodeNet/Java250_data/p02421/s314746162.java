import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int turns = sc.nextInt();
		int score1 = 0;
		int score2 = 0;
		
		for(int i=0; i<turns; i++){
			String word1 = sc.next();
			String word2 = sc.next();
			int cp = word1.compareTo(word2);
			
			if (cp < 0) {
				score2+=3;
			} else if (cp == 0) {
				score1+=1;
				score2+=1;
			} else {
				score1+=3;
			}
			
		}
		
		
		System.out.printf("%d %d", score1, score2);
		System.out.println();
		
	}
}

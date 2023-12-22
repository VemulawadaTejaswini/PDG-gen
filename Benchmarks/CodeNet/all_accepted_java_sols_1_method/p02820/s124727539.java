
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int banned = scan.nextInt();
		
		int scoreR = scan.nextInt();
		int scoreS = scan.nextInt();
		int scoreP = scan.nextInt();
		
		String s = scan.next();
		
		char[] hand = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < hand.length; i++) {
			switch (hand[i]) {
	        case 'r':
	        	if (i - banned < 0) {
	        		cnt += scoreP;
	        		break;
	        	}
	        	
	        	if (hand[i] == hand[i - banned]) {
	        		hand[i] = 'a';
	        		break;
	        	}
	        	
	        	cnt += scoreP;
	            break;
	        case 's':
	        	if (i - banned < 0) {
	        		cnt += scoreR;
	        		break;
	        	}
	        	
	        	if (hand[i] == hand[i - banned]) {
	        		hand[i] = 'a';
	        		break;
	        	}
	        	
	        	cnt += scoreR;
	            break;
	        case 'p':
	        	if (i - banned < 0) {
	        		cnt += scoreS;
	        		break;
	        	}
	        	
	        	if (hand[i] == hand[i - banned]) {
	        		hand[i] = 'a';
	        		break;
	        	}
	        	
	        	cnt += scoreS;
	            break;
	        }
		}
		
		System.out.println(cnt);
		
		
	}
}
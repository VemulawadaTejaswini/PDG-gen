import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] S = new int[13];
		int[] H = new int[13];
		int[] C = new int[13];
		int[] D = new int[13];
		
		for(int i = 1; i <= 13; i++) {
			S[i - 1] = i;
			H[i - 1] = i;
			C[i - 1] = i;
			D[i - 1] = i;
		}
		
		String cardPicture;
		int cardRank;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			cardPicture = sc.next();
			cardRank = sc.nextInt();
			
			if(cardPicture.equals("S")) {
				S[cardRank - 1] = 0;
			} else if(cardPicture.equals("H")) {
				H[cardRank - 1] = 0;
			} else if(cardPicture.equals("C")) {
				C[cardRank - 1] = 0;
			} else if(cardPicture.equals("D")) {
				D[cardRank - 1] = 0;
			}
		}
		
		for(int i = 0; i < 13; i++) {
			if(S[i] != 0) {
				System.out.println("S " + S[i]);
			}
		}
		
		for(int i = 0; i < 13; i++) {
			if(H[i] != 0) {
				System.out.println("H " + H[i]);
			}
		}
		
		for(int i = 0; i < 13; i++) {
			if(C[i] != 0) {
				System.out.println("C " + C[i]);
			}
		}
		
		for(int i = 0; i < 13; i++) {
			if(D[i] != 0) {
				System.out.println("D " + D[i]);
			}
		}
	}
}
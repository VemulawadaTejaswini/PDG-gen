import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static int score1, score2, win1, win2;
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		while (N-- > 0) {
			ArrayList<Integer> card1 = new ArrayList<Integer>(), card2 = new ArrayList<Integer>();
			for (int i = 0; i < 9; i++)
				card1.add(sc.nextInt());
			
			for (int i = 0; i < 9; i++)
				card2.add(sc.nextInt());
			
			score1 = score2 = win1 = win2 = 0;
			rec(card1, card2, 0, 0, 0);
			
			System.out.printf("%.5f", (double)(win1) / (win1 + win2));
			System.out.printf(" %.5f", (double)(win2) / (win1 + win2));
			System.out.println();
		}
	}
	
	public static void rec(ArrayList<Integer> card1, ArrayList<Integer> card2, int s1, int s2, int cnt) {
		if (cnt == 9) {
			if (score1 < score2) {
				win2++;
			} else if (score1 > score2){
				win1++;
			}
			return;
		}
		
		int val1 = card1.get(0);
		card1.remove(0);
		for (int j = 0; j < card2.size(); j++) {
			int val2 = card2.get(j);
					
			if (val1 < val2) {
				score2 += val1 + val2;
			} else {
				score1 += val1 + val2;
			}
				
			card2.remove(j);

			rec(card1, card2, score1, score2, cnt + 1);
							
			card2.add(val2);
			
			Collections.sort(card2);
				
			if (val1 < val2) {
				score2 -= val1 + val2;
			} else {
				score1 -= val1 + val2;
			}
		}
		card1.add(val1);
		Collections.sort(card1);
		
	}
}
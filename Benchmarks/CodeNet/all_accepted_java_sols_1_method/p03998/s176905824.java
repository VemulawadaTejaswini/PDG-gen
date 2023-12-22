import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] card = new String[3];
		Arrays.setAll(card, i -> sc.next());
		
		int[] idx = new int[3];
		
		int player = 0;
		while (true) {
			if (idx[player] == card[player].length()) break;
			
			player = card[player].charAt(idx[player]++) - 'a';
		}
		
		String winner = "" + (char) ('A' + player);
		System.out.println(winner);
		
		sc.close();
	}
}



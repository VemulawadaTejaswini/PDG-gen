import java.util.Scanner;
import java.util.regex.*;

public class Main {
	
	private static final int PLAYER = 4;
	private static final int TRICK = 13;
	private static final Matcher[] SUIT_MATCHER = {
		Pattern.compile("S").matcher(""),
		Pattern.compile("H").matcher(""),
		Pattern.compile("D").matcher(""),
		Pattern.compile("C").matcher("")
	};
	private static final Matcher[] RANK_MATCHER = {
		Pattern.compile("T").matcher(""),
		Pattern.compile("J").matcher(""),
		Pattern.compile("Q").matcher(""),
		Pattern.compile("K").matcher(""),
		Pattern.compile("A").matcher("")
	};
	
	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		
		for (String trump = scanner.nextLine(); !trump.equals("#"); trump = scanner.nextLine()) {
			
			int score = - 6;
			final int playedCardStrength[][] = new int[PLAYER][TRICK];
			
			final Matcher trumpMatcher = Pattern.compile(trump).matcher("");
			for (int i = 0;i < PLAYER;i ++) {
				
				String playedCardString = trumpMatcher.reset(new StringBuilder(scanner.nextLine()).reverse().toString()).replaceAll("10");
				for (int j = 0; j < SUIT_MATCHER.length; j ++) {
					
					playedCardString = SUIT_MATCHER[j].reset(playedCardString).replaceAll((1 << j) + "");
				}
				for (int j = RANK_MATCHER.length - 1; j >= 0; j --) {
					
					playedCardString = RANK_MATCHER[j].reset(playedCardString).replaceAll((char) ('A' + j) + "");
				}
				
				final Scanner playedCardScanner = new Scanner(playedCardString);
				for (int j = TRICK - 1; j >= 0; j --) {
					
					playedCardStrength[i][j] = Integer.valueOf(playedCardScanner.next(), 16);
				}
			}
			
			int winner = 0;
			for (int j = 0; j < TRICK; j ++) {
				
				int led = playedCardStrength[winner][j] & 0xF0 | ~0xF0;
				for (int i = 0;i < PLAYER;i ++) {
					
					if ((playedCardStrength[i][j] & led) > playedCardStrength[winner][j]) {
						
						winner = i;
					}
				}
				score += winner & 1;
			}
			
			System.out.println((score > 0) ? ("EW " + score): ("NS " + (1 - score)));
		}
	}
}
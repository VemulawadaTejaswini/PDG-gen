import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String END = "-";
		
		Scanner stdin = new Scanner(System.in);
		int numShuffle = 0, in = 0;
		StringBuilder pile = new StringBuilder();
		
		while (true) {
			try {
				pile.append(stdin.next());
				if (END.equals(pile.toString()))
					break;
				numShuffle = stdin.nextInt();

				for (int i = 0; i < numShuffle; ++i) {
					in = stdin.nextInt();
					pile.append(pile.substring(0, in));
					pile.delete(0, in);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(pile);
			pile.delete(0, pile.length());
		}
		stdin.close();
	}
}
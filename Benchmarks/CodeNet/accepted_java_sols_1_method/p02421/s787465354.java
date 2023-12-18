import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int score_t = 0;
		int score_h = 0;
		while (n-- > 0) {
			String word_t = sc.next();
			String word_h = sc.next();

			int result = word_t.compareTo(word_h);
			if (result == 0) {
				score_t += 1;
				score_h += 1;
			} else if (result > 0) {
				score_t += 3;
			} else {
				score_h += 3;
			}
		}

	    System.out.println(score_t + " " + score_h);
	}
}
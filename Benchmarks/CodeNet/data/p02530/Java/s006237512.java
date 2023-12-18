import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int score_a = 0;
		int score_b = 0;

		for (int i = 0; i < n; i++) {
			String word_a = sc.next();
			String word_b = sc.next();
			if (word_a.equals(word_b)) {
				score_a++;
				score_b++;
			} else {
				score_a = word_a.compareTo(word_b) > 0 ? score_a + 3 : score_a;
				score_b = word_b.compareTo(word_a) > 0 ? score_b + 3 : score_b;
			}
		}

		System.out.println(score_a + " " + score_b);

	}

}
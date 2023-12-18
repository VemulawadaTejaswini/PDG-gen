import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	private static final String SPLIT_STR = " ";
	private static final int NOT_TEST = -1;
	private static final int[] SCORE_ARRAY = {80, 65, 50, 30, 0};
	private static final String[] GRADE_ARRAY = {"A", "B", "C", "D", "F"};
	private static final int SCORE_D = 30;
	private static final int SCORE_RETEST = 50;

	public static void main(String[] args) {

		String input = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			input = sc.nextLine();
			String[] split = input.split(SPLIT_STR);
			int m = Integer.parseInt(split[0]);
			int f = Integer.parseInt(split[1]);
			int r = Integer.parseInt(split[2]);

			if (m == NOT_TEST && f == NOT_TEST && r == NOT_TEST) {
				break;
			}

			if (m == NOT_TEST || f == NOT_TEST) {
				System.out.println(GRADE_ARRAY[GRADE_ARRAY.length - 1]);
				continue;
			}

			for (int i = 0; i < SCORE_ARRAY.length; i++) {
				int score = m + f;
				if (score >= SCORE_ARRAY[i]) {
					if (SCORE_ARRAY[i] == SCORE_D && r >= SCORE_RETEST) {
						System.out.println(GRADE_ARRAY[i - 1]);
					} else {
						System.out.println(GRADE_ARRAY[i]);
					}
					break;
				}
			}
		}

		sc.close();
	}
}


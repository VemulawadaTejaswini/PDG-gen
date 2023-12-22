
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		sc.nextInt();
		int Q = sc.nextInt();

		String[] S = sc.next().split("");

		int[][] questions = new int[Q][2];

		for (int i = 0; i < questions.length; i++) {
			questions[i][0] = sc.nextInt();
			questions[i][1] = sc.nextInt();

		}

		// N字ごとのACの表れる回数を数えて配列に格納しておく

		int[] arry = new int[S.length];

		for (int i = 0; i < S.length; i++) {
			if (i == 0) {
				arry[i] = 0;
			} else {
				if ("AC".equals(S[i - 1] + S[i])) {
					arry[i] = arry[i - 1] + 1;
				} else {
					arry[i] = arry[i - 1];
				}
			}
		}

		for (int i = 0; i < questions.length; i++) {
			System.out.println(arry[questions[i][1] - 1] - arry[questions[i][0] - 1]);
		}

	}
}
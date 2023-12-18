import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int midterm_exam_score;
		int final_examination_score;
		int retest_score;
		int sum;

		while (true) {
			midterm_exam_score = sc.nextInt();
			final_examination_score = sc.nextInt();
			retest_score = sc.nextInt();
			//m,f,rがすべて-1のとき入力を終える
			if (midterm_exam_score == -1 && final_examination_score == -1 && retest_score == -1) {
				break;
			}

			if (midterm_exam_score == -1 || final_examination_score == -1) {
				System.out.println("F");
			} else {
				sum = midterm_exam_score + final_examination_score;
				if (sum >= 80) {
					System.out.println("A");
				} else if (sum >= 65) {
					System.out.println("B");
				} else if (sum >= 50) {
					System.out.println("C");
				} else if (sum >= 30) {
					if (retest_score >= 50) {
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				} else {
					System.out.println("F");
				}
			}
		}
		sc.close();
	}
}


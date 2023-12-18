import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] answers = new int[N + 1];

		for (int i = 0; i < N - 1; i++) {
			answers[scan.nextInt()]++;
		}

		for (int i = 1; i <= N; i++) {
			System.out.println(answers[i]);
		}
	}
}
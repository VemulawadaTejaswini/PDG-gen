import java.util.Scanner;

public class Main {

	private static final String SHARP = "#";
	private static final String DOT = ".";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int answer = 0;

		if (B < C || D < A) {
			answer = 0;
		} else {
			answer = Math.min(B, D) - Math.max(A, C);
		}

		System.out.println(answer);
	}
}

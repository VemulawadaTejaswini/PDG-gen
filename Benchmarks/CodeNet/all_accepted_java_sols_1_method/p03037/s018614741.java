import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int left = 1;
		int right = N;

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			left = Math.max(left, a);
			right = Math.min(right, b);
		}
		int answer = right - left + 1;
		if (answer > 0) {
			System.out.println(answer);
		} else {
			System.out.println(0);
		}

	}

}
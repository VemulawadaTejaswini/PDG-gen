import java.util.Scanner;

public class Main {

	public static long[] nums;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int answer = 0;

		for (int i = 1; i < N; i++) {
			answer += (N - 1) / i;
		}

		System.out.println(answer);
	}
}
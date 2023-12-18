import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int max = 0;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			int H = scan.nextInt();
			if (H >= max) {
				answer++;
				max = H;
			}
		}

		System.out.println(answer);
 	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		int answer = 0;

		if (N % 2 != 0) {
			answer = N * 2;
		} else {
			answer = N;
		}

		System.out.print(answer);

	}
}
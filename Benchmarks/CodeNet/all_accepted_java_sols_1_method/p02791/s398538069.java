import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P[] = new int[N];
		int result = 1;

		for (int i = 0; i < N; i++) {
			P[i] = scan.nextInt();
		}

		int min = P[0];
		for (int i = 1; i < N; i++) {
				if (min > P[i]) {
					min = P[i];
					result++;
				}
			}

		System.out.println(result);

	}

}

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int m = 0;

		for (int i = 1; i <= N; i++) {
			if((i % 2) == 1) {
				m++;
			}
		}
		
		System.out.println((float) m / N);

	}
}

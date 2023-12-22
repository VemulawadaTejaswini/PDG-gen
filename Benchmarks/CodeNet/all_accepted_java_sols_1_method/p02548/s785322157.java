import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		sc.close();
		long count = 0;

		label: for (int a = 1; a < N; a++) {
			for (int b = 1; b < N; b++) {
				if (a * b < N) {
					count++;
				} else {
					continue label;
				}

			}
		}

		System.out.print(count);
	}

}
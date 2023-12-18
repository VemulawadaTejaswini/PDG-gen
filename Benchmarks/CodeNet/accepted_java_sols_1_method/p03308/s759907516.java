import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int[N];

		int min = 1000000000;
		int max = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();

			if (a[i] < min) {
				min = a[i];
			}

			if (a[i] > max) {
				max = a[i];
			}

		}
		sc.close();

		System.out.print(max - min);

	}
}
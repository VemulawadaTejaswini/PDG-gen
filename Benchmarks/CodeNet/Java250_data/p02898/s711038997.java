import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();

			if (list[i] < k) {
				count++;
			}
		}

		System.out.println(n - count);

		sc.close();

	}
}
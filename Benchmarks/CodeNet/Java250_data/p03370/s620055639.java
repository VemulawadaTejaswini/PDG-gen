import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int min = 100000;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			sum += m;
			if (m < min) {
				min = m;
			}
		}

		System.out.println(n + (x - sum) / min);

		sc.close();
	}
}

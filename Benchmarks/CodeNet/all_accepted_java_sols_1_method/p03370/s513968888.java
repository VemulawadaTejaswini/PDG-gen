import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int m[] = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			m[i] = sc.nextInt();
			sum += m[i];
		}

		int min = m[0];

		for (int i = 0; i < m.length; i++) {
			int tmp = m[i];
			if (tmp < min) {
				min = tmp;
			}
		}
		System.out.println(N + (X - sum)/min);
	}
}

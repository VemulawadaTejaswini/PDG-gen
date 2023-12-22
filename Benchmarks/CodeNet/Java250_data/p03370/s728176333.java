import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int m[] = new int[n];
		int min = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			min = Math.min(min, m[i]);
			sum += m[i];
		}

		System.out.println(n + (x - sum) / min);

		sc.close();

	}

}

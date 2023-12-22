import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long dm[] = new long[n];
		long mt[] = new long[n];

		for (int i = 0; i < n; i++) {
			dm[i] = sc.nextLong();
		}

		mt[0] = 0;
		int count = 0;
		int i = 0;

		while (count != n - 1) {
			mt[(i + 2) % n] = mt[i % n] + (dm[(i + 1) % n] - dm[i % n]) * 2;
			count++;
			i = (i + 2) % n;
		}

		long x = (2 * dm[0] - mt[1]) / 2;

		for (int j = 0; j < n; j++) {
			//			System.out.print(j + ": ");
			System.out.println(mt[j] + x);
		}

		sc.close();
	}
}
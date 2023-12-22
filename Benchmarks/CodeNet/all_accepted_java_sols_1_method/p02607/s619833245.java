import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int oddCount = 0;
		for (int i = 1; i <= n; i++) {
			int ai = sc.nextInt();
			if (i % 2 == 1) {
				if (ai % 2 == 1) {
					oddCount++;
				}
			}
		}
		sc.close();

		System.out.println(oddCount);

	}
}

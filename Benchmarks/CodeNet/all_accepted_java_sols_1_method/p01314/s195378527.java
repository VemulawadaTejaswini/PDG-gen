
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		while (true) {
			int T = sc.nextInt();
			int count = 0;
			int nplus = 0;
			if (T == 0)
				break;

			while (!(nplus == T-1)) {
				sum = 0;
				for (int i = 1 + nplus; i < T; i++) {
					sum += i;
					if (sum == T) {
						count++;
						nplus++;
						break;

					}
					if (i == T - 1) {
						nplus++;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();

	}
}

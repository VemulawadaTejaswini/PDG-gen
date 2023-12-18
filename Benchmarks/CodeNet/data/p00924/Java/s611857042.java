import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] seq = new int[N];
		int[] run = new int[M];

		for (int i = 0; i < seq.length; i++) {
			seq[i] = sc.nextInt();
		}

		for (int i = 0; i < run.length; i++) {
			run[i] = sc.nextInt();
		}
		sc.close();

		int irregular = 0;
		int now = 0;
		int k = 0;
		for (int i = 0; i < run.length; i++) {
			for (int j = 0; j < run[i]; j++) {
				if (seq[k] != now) {
					irregular++;
				}
				k++;
			}
			now = (now + 1) % 2;
		}

		irregular = Math.min(irregular, N - irregular);
		System.out.println(irregular / 2);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			if (a == 0)
				break;
			double sum = 0;
			int[] b = new int[a];
			for (int i = 0; i < a; i++) {
				b[i] = scanner.nextInt();
				sum += b[i];
			}
			double m = sum / a;
			double aa = 0;
			for (int i = 0; i < a; i++) {
				aa += Math.pow(b[i] - m, 2) / a;
			}
			System.out.println(Math.sqrt(aa));

		}

	}
}
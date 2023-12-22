
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			double[] num = new double[3];
			for (int i = 0; i < 3; i++) {
				num[i] = scanner.nextInt();
			}
			if (num[0] == 0 && num[1] == 0 && num[2] == 0)
				break;
			Arrays.sort(num);
			double max = Math.sqrt(Math.pow(num[0], 2) + Math.pow(num[1], 2));
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				int d = scanner.nextInt() * 2;
				if (d > max) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}
}
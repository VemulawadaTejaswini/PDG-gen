
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum;
			double a, b;

			int n = sc.nextInt();

			if (n == 0)
				break;
			int[] list = new int[n];
			sum = 0;
			for (int i = 0; i < list.length; i++) {
				int input = sc.nextInt();
				list[i] = input;
				sum += list[i];
			}
			a = 0;
			double avg = (double) (sum / n);
			for (int j = 0; j < list.length; j++) {
				a += Math.pow(list[j] - avg, 2) / n;
			}
			b = Math.sqrt(a);
			System.out.println(b);
		}
	}
}
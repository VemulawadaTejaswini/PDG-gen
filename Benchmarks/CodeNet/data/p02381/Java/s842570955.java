
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int s[] = new int[n];
			double m = 0;
			double sum = 0;

			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			m = sum / n;

			sum = 0;

			for (int i = 0; i < n; i++) {
				sum += (s[i] - m) * (s[i] - m);
			}

			double a = Math.sqrt(sum / n);
			System.out.println(a);
		}
	}

}
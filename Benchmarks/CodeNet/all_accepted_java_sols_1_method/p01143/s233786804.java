import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if ((n | m | p) == 0)
				break;
			int hit = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				sum += tmp;
				if (i == m - 1) {
					hit = tmp;
				}
			}
			double rest = 1.0 * 100 * sum * (100 - p) / 100;
			int dist = (int) (rest / hit);
			System.out.println(hit != 0 ? dist : 0);
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
			}
			System.out.println(31);
			int o = 31;
			loop: while (true) {
				for (int t : num) {
					o = Math.max(o - t, 0);
					System.out.println(o);
					if (o == 0)
						break loop;
					o -= 5 - t;
					System.out.println(o);
				}
			}
		}
	}
}
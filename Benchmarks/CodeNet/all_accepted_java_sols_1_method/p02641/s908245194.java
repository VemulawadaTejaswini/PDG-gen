import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();

		if (n == 0) {
			System.out.println(x);
			System.exit(0);
		}

		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p.add(scan.nextInt());
		}

		int y1;
		int y2;

		for (int i = 0; i <= 100; i++) {
			y1 = x - i;
			y2 = x + i;

			if (p.contains(y1)) {
				if (p.contains(y2)) {

				} else {
					System.out.println(y2);
					break;
				}
			} else {
				System.out.println(y1);
				break;
			}
		}

		scan.close();

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			sc.nextLine();
			List<Integer> tList = new ArrayList<Integer>();
			int total = 0;
			for (int i = 0; i < n; i++) {
				int ti = sc.nextInt();
				tList.add(ti);
				total += ti;
			}
			sc.nextLine();

			int m = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < m; i++) {
				int pi = sc.nextInt();
				int xi = sc.nextInt();

				int t = tList.get(pi - 1);

				System.out.println(total - (t - xi));
				sc.nextLine();
			}

		} finally {
			sc.close();
		}
	}
}
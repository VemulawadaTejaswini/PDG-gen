import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			count += a;
			list.add(a);
		}
		list.sort(Comparator.reverseOrder());
		int c = list.get(m - 1);

		int check = count / (4 * m);
		int check1 = count % (4 * m);
		if (check1 > 0) {
			check += 1;
		}

		if (c >= check) {
			System.out.println("Yes");

		} else {
			System.out.println("No");

		}

		sc.close();
	}

}
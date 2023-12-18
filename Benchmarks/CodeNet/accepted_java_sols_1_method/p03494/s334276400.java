import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		int resultCount = 0;

		for (int i = 0; i < n; i++) {
			final int num = sc.nextInt();
			if (num % 2 == 0) {
				list.add(num);
			} else {
				break;
			}
		}

		if (list.size() != n) {
			System.out.print(resultCount);
			return;
		}

		boolean continueFlag = true;
		while (continueFlag) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				int num = list.get(j);
				if (num % 2 == 0) {
					list.set(j, num / 2);
					count++;
				} else {
					continueFlag = false;
					break;
				}
			}

			if (count == n) {
				resultCount++;
			}
		}

		System.out.print(resultCount);

		sc.close();

	}

}

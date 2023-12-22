import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();

			list.add(x);

		}
		if (n > m) {
			System.out.println(0);
			sc.close();
			return;
		}
		Collections.sort(list);

		for (int i = 0; i < m - 1; i++) {

			int low = list.get(i);
			int high = list.get(i + 1);

			int sub = high - low;

			subList.add(sub);

		}

		Collections.sort(subList);
		Collections.reverse(subList);

		for (int i = 0; i < n - 1; i++) {

			subList.remove(0);

		}
		int ans = subList.stream().mapToInt(Integer::valueOf).sum();

		System.out.println(ans);

		sc.close();
	}

}

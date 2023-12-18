import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		List<Integer> list = new ArrayList<>();

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			list.add(a);
		}

		long ans = 0;

		int tail = n;

		while (tail != 0) {

			int max = 0;
			int maxIndex = n;
			for (int i = tail - 1; 0 <= i; i--) {
				if (max <= list.get(i)) {
					max = list.get(i);
					maxIndex = i;
				}
			}

			for (int i = maxIndex; i < tail; i++) {
				ans += max - list.get(i);
			}

			tail = maxIndex;
		}

		System.out.println(ans);

		sc.close();
	}

}
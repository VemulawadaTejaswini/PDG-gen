import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		LinkedList<Integer> listA = new LinkedList<Integer>();
		LinkedList<Integer> listB = new LinkedList<Integer>();


		for (int i = 0; i < n; i++) {
			listA.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			listB.add(sc.nextInt());
		}

		sc.close();

		int sum = 0;
		int ans = 0;

		while (sum < k) {

			if (listA.isEmpty() && listB.isEmpty()) break;

			else if (listA.isEmpty()) sum += listB.poll();

			else if (listB.isEmpty()) sum += listA.poll();

			else {

				if (listA.getFirst() >= listB.getFirst()) {

					if (listA.getFirst() == listB.getFirst()) {

						if (listA.get(1) > listB.get(1)) {
							sum += listB.poll();

						} else {
							sum += listA.poll();
						}

					} else {
						sum += listB.poll();
					}

				} else {
					sum += listA.poll();
				}
			}

			if (sum > k) {
				break;

			} else {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
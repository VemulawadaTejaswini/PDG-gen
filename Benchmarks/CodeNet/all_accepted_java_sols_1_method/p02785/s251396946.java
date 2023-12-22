

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		long count = 0l;

		ArrayList<Integer> deque = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			deque.add(scan.nextInt());
		}

		Collections.sort(deque);

		if (n > k) {
			for (int i = 0; i < k; i++) {
				deque.remove(deque.size() - 1);
			}

			for (int i = 0; i < deque.size(); i++) {
				count += deque.get(i);
			}
		}

		System.out.println(count);
	}

}

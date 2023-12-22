// preparation for N log^2 N

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		int sum = 0;
		for (int i = 0; i < A.length; ++i) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		if (sum >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}

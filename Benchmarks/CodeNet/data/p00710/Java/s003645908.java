

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HanafudaShuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> array = new ArrayList<Integer>();
		while (true) {
			int N = sc.nextInt();
			int r = sc.nextInt();
			if (N == 0 && r == 0) {
				break;
			}
			array.clear();
			for (int i = 0; i < N; i++) {
				array.add(N - i);
			}

			while (!(r == 0)) {
				r--;
				int p = sc.nextInt();
				int c = sc.nextInt();
				int pop = 0;
				for (int ii = 0; ii < r; ii++) {
					array.add(0, array.get(p + c - 2));
					array.remove(p + c-1);


				}
			}
			System.out.println((array.get(0)+1));
		}
	}
}


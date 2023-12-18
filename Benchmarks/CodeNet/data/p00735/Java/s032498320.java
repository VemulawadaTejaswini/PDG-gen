

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> data = new ArrayList<>();

	static void solve(int b) {
		List<Integer> ansList = new ArrayList<>();
		System.out.print(b + ":");
		for (int i = 0; i < data.size(); ++i) {
			if (b % data.get(i) == 0) {
				ansList.add(data.get(i));
			}
		}
		for (Integer int1 : ansList) {
			System.out.print(" " + int1);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		boolean[] filter = new boolean[300000];

		for (int i = 6; i < 300000; i++) {
			if ((i % 7 == 1 || i % 7 == 6) && !filter[i]) {
				for (int j = i; j < 300000; j += i) {
					filter[j] = true;
				}
				data.add(i);
			}
		}
		Scanner in = new Scanner(System.in);

		while (true) {
			int b = in.nextInt();
			if (b == 1) {
				return;
			}
			solve(b);
		}
	}
}
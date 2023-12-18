package itp2Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 0) {
				int x = sc.nextInt();
				pushBack(list, x);
			} else if (q == 1) {
				int x = sc.nextInt();
				randomAccess(list, x);
			} else {
				popBack(list);
			}
		}
	}

	public static void pushBack(List<Integer> list, int x) {
		list.add(x);
	}

	public static void randomAccess(List<Integer> list, int x) {
		System.out.println(list.get(x));
	}

	public static void popBack(List<Integer> list) {
		int last = list.size() - 1;
		list.remove(last);
	}

}


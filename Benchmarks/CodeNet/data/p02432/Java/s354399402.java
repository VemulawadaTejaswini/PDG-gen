
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 0) {
				int d = sc.nextInt();
				int x = sc.nextInt();
				push(list, d, x);
			} else if (q == 1) {
				int x = sc.nextInt();
				randomAccess(list, x);
			} else {
				int d = sc.nextInt();
				popBack(list, d);
			}
		}
	}

	public static void push(List<Integer> list, int d, int x) {
		if (d == 0) {
			list.add(0, x);
		} else {
			list.add(x);
		}
	}

	public static void randomAccess(List<Integer> list, int x) {
		System.out.println(list.get(x));
	}

	public static void popBack(List<Integer> list, int d) {
		if (d == 0) {
			list.remove(0);
		} else {
			int last = list.size() - 1;
			list.remove(last);
		}
	}

}


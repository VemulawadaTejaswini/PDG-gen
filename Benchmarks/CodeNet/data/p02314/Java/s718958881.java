import java.util.*;

public class Main {

	static int goal;
	static int items;
	static int[] list;
	static int[][] cache;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		goal = sc.nextInt();
		items = sc.nextInt();
		list = new int[items];
		cache = new int[goal + 1][items];
		for (int i = 0; i < items; i++) {
			int a = sc.nextInt();
			list[i] = a;

		}

		System.out.println(compute(goal, items - 1));
		sc.close();
	}

	public static int compute(int value, int last) {
		if (cache[value][last] != 0) {
			return cache[value][last];
		}

		if (value == 0) {
			return 0;
		}
		if (last < 0 || value < 0) {
			return Integer.MAX_VALUE / 2;
		}

		int include = 1 + compute(value - list[last], last);
		int exclude = compute(value, last - 1);

		cache[value][last] = Math.min(include, exclude);
		return Math.min(include, exclude);

	}

}

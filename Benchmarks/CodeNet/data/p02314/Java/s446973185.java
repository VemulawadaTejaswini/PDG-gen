import java.util.*;

public class Main {
	static int goal;
	static Integer[] list;
	static int[] cache;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		goal = sc.nextInt();
		int c = sc.nextInt();
		list = new Integer[c];
		cache = new int[goal + 1];
		for (int i = 0; i < c; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list,Collections.reverseOrder());
		System.out.println(compute(goal));
	}

	public static int compute(int value) {
		if (cache[value] != 0) {
			return cache[value];
		}
		if (value == 0) {

			return 0;
		}
		int result = Integer.MAX_VALUE;
		for (int e : list) {
			if (e <= value) {
				int sub = compute(value - e);
				if (sub + 1 < result) {
					result = sub + 1;
				}
			}
		}
		cache[value] = result;
		return result;
	}
}
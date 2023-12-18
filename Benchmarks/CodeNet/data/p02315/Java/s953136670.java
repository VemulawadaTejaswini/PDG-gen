import java.util.*;

public class Main {

	static int items;
	static int max;
	static int[] value;
	static int[] cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		items = sc.nextInt();
		max = sc.nextInt();
		value = new int[items];
		cost = new int[items];
		for (int i = 0; i < items; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			value[i] = a;
			cost[i] = b;
		}
		System.out.println(compute(max, items - 1));

	}

	public static int compute(int weight, int size) {

		if (weight < 0) {
			return Integer.MIN_VALUE / 2;
		}
		if (size < 0 || weight == 0) {
			return 0;
		}

		int include = value[size] + compute(weight - cost[size], size-1);
		int exclude = compute(weight, size-1);
		return Math.max(include, exclude);
	}

}


import java.util.*;

public class Main {
	static int items;
	static int max;
	static int[] value;
	static int[] cost;
	static HashMap<Integer, Integer> map = new HashMap<>();

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

	public static int compute(int limit, int pos) {

		if (limit < 0) {
			return Integer.MIN_VALUE / 2;
		}
		if (limit == 0 || pos < 0) {
			return 0;
		}
		try {
			if (map.get(Integer.hashCode(limit + pos)+Integer.hashCode(limit / pos)) != null) {
				return map.get(Integer.hashCode(limit + pos)+Integer.hashCode(limit / pos));
			}
		} catch (Exception e) {
		}

		int include = value[pos] + compute(limit - cost[pos], pos - 1);
		int exclude = compute(limit, pos - 1);
		int a = Integer.hashCode(limit + pos) + Integer.hashCode(limit / pos);
		map.put(a, Math.max(include, exclude));
		return Math.max(include, exclude);
	}
}

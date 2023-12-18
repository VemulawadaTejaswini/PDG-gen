import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var q = sc.nextInt();
		var q1 = new int[q];
		var q2 = new int[q];
		for (var i = 0; i < q; i++) {
			q1[i] = sc.nextInt();
			q2[i] = sc.nextInt();
		}
		sc.close();

		var sum = (long) (n - 2) * (n - 2);
		var x = new HashMap<Integer, Integer>();
		var y = new HashMap<Integer, Integer>();
		var x2 = new Main().new SortedList();
		var y2 = new Main().new SortedList();
		x.put(n, n);
		y.put(n, n);
		x2.add(n);
		y2.add(n);
		for (var i = 0; i < q; i++) {
			var qt = q1[i];
			var qv = q2[i];
			if (qt == 1) {
				var v = search(x, x2, qv, n);
				sum -= v - 2;
				update(y, y2, v, qv);
			} else {
				var v = search(y, y2, qv, n);
				sum -= v - 2;
				update(x, x2, v, qv);
			}
		}
		System.out.println(sum);
	}

	private static int search(HashMap<Integer, Integer> map, SortedList list, int key, int n) {
		var mapKey = list.searchValue(key);
		var result = map.get(mapKey);
		return result;
	}

	private static void update(HashMap<Integer, Integer> map, SortedList list, int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, Math.min(map.get(key), value));
			list.add(key);
		} else {
			map.put(key, value);
			list.add(key);
		}
	}

	public class SortedList {
		List<Integer> list;

		public SortedList() {
			this.list = new ArrayList<Integer>();
		}

		public SortedList(List<Integer> list) {
			this.list = list;
		}

		public int get(int index) {
			return list.get(index);
		}

		public void add(int value) {
			list.add(search(value), value);
		}

		public int remove(int index) {
			return list.remove(index);
		}

		public int searchValue(int value) {
			return list.get(search(value));
		}

		private int search(int value) {
			var min = 0;
			var max = list.size();
			while (max - min > 1) {
				var mid = min + (max - min) / 2;
				if (list.get(mid) <= value) {
					min = mid;
				} else {
					max = mid;
				}
			}

			if (max - min == 1 && list.get(min) <= value) {
				min++;
			}
			return min;
		}
	}
}

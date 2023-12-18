import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.y = Integer.parseInt(sa[1]);
			o.u = sa[2];
			arr[i] = o;
		}
		br.close();

		int ans = Integer.MAX_VALUE;

		// 上下
		Map<Integer, TreeSet<Obj>> map1 = new HashMap<>();
		Map<Integer, TreeSet<Obj>> map2 = new HashMap<>();
		for (Obj o : arr) {
			if ("U".equals(o.u)) {
				TreeSet<Obj> set = map1.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 map1.put(o.x, set);
				}
				set.add(o);
			}
			if ("D".equals(o.u)) {
				TreeSet<Obj> set = map2.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 map2.put(o.x, set);
				}
				set.add(o);
			}
		}
		for (Integer x : map1.keySet()) {
			TreeSet<Obj> set1 = map1.get(x);
			TreeSet<Obj> set2 = map2.get(x);
			if (set2 != null) {
				for (Obj o1 : set1) {
					Obj o2 = set2.higher(o1);
					if (o2 != null) {
						int val = (o2.y - o1.y) * 5;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 左右
		map1 = new HashMap<>();
		map2 = new HashMap<>();
		for (Obj o : arr) {
			if ("R".equals(o.u)) {
				TreeSet<Obj> set = map1.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map1.put(o.y, set);
				}
				set.add(o);
			}
			if ("L".equals(o.u)) {
				TreeSet<Obj> set = map2.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map2.put(o.y, set);
				}
				set.add(o);
			}
		}
		for (Integer y : map1.keySet()) {
			TreeSet<Obj> set1 = map1.get(y);
			TreeSet<Obj> set2 = map2.get(y);
			if (set2 != null) {
				for (Obj o1 : set1) {
					Obj o2 = set2.higher(o1);
					if (o2 != null) {
						int val = (o2.x - o1.x) * 5;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 下左
		Map<Integer, TreeSet<Obj>> mapD = make(arr, "D", true);
		Map<Integer, TreeSet<Obj>> mapL = make(arr, "L", true);
		for (Integer v : mapD.keySet()) {
			TreeSet<Obj> set = mapD.get(v);
			TreeSet<Obj> set2 = mapL.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.higher(o);
					if (o2 != null) {
						int val = (o2.x - o.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 上右
		Map<Integer, TreeSet<Obj>> mapU = make(arr, "U", true);
		Map<Integer, TreeSet<Obj>> mapR = make(arr, "R", true);
		for (Integer v : mapU.keySet()) {
			TreeSet<Obj> set = mapU.get(v);
			TreeSet<Obj> set2 = mapR.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.lower(o);
					if (o2 != null) {
						int val = (o.x - o2.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 下右
		mapD = make(arr, "D", false);
		mapR = make(arr, "R", false);
		for (Integer v : mapD.keySet()) {
			TreeSet<Obj> set = mapD.get(v);
			TreeSet<Obj> set2 = mapR.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.lower(o);
					if (o2 != null) {
						int val = (o.x - o2.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 上左
		mapU = make(arr, "U", false);
		mapL = make(arr, "L", false);
		for (Integer v : mapU.keySet()) {
			TreeSet<Obj> set = mapU.get(v);
			TreeSet<Obj> set2 = mapL.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.higher(o);
					if (o2 != null) {
						int val = (o2.x - o.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println("SAFE");
		} else {
			System.out.println(ans);
		}
	}

	static Map<Integer, TreeSet<Obj>> make(Obj[] arr, String u, boolean plus) {
		Map<Integer, TreeSet<Obj>> map = new HashMap<>();
		for (Obj o : arr) {
			if (u.equals(o.u)) {
				if (plus) {
					o.val = o.y + o.x;
				} else {
					o.val = o.y - o.x;
				}
				TreeSet<Obj> set = map.get(o.val);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map.put(o.val, set);
				}
				set.add(o);
			}
		}
		return map;
	}

	static class Obj {
		int x, y, val;
		String u;
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
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
		TreeMap<Integer, TreeSet<Obj>> mapR = new TreeMap<>();
		TreeMap<Integer, TreeSet<Obj>> mapL = new TreeMap<>();
		for (Obj o : arr) {
			if ("U".equals(o.u)) {
				TreeSet<Obj> set = mapR.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 mapR.put(o.x, set);
				}
				set.add(o);
			}
			if ("D".equals(o.u)) {
				TreeSet<Obj> set = mapL.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 mapL.put(o.x, set);
				}
				set.add(o);
			}
		}
		for (Integer x : mapR.keySet()) {
			TreeSet<Obj> set1 = mapR.get(x);
			TreeSet<Obj> set2 = mapL.get(x);
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
		mapR = new TreeMap<>();
		mapL = new TreeMap<>();
		for (Obj o : arr) {
			if ("R".equals(o.u)) {
				TreeSet<Obj> set = mapR.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 mapR.put(o.y, set);
				}
				set.add(o);
			}
			if ("L".equals(o.u)) {
				TreeSet<Obj> set = mapL.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 mapL.put(o.y, set);
				}
				set.add(o);
			}
		}
		for (Integer y : mapR.keySet()) {
			TreeSet<Obj> set1 = mapR.get(y);
			TreeSet<Obj> set2 = mapL.get(y);
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

		// 下左、上右
		TreeMap<Integer, TreeSet<Obj>> mapD = make(arr, "D", true);
		TreeMap<Integer, TreeSet<Obj>> mapU = make(arr, "U", true);
		mapR = make(arr, "R", true);
		mapL = make(arr, "L", true);
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

		// 下右、上左
		mapD = make(arr, "D", false);
		mapU = make(arr, "U", false);
		mapR = make(arr, "R", false);
		mapL = make(arr, "L", false);
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

	static TreeMap<Integer, TreeSet<Obj>> make(Obj[] arr, String u, boolean plus) {
		TreeMap<Integer, TreeSet<Obj>> map = new TreeMap<>();
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

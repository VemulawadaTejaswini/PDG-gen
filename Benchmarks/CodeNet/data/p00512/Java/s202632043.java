import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String s; int v;
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			s = sc.next();
			v = sc.nextInt();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + v);
			} else {
				map.put(s, v);
			}
		}
		
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys, new Comparator<Object>() {
			public int compare(Object k1, Object k2) {
				if (k1.toString().length() == k2.toString().length()) {
					return k1.toString().compareTo(k2.toString());
				} else {
					return (k1.toString().length() - k2.toString().length());
				}
			}
		});
		
		for(int i = 0; i < keys.length; i++) {
			System.out.println(keys[i].toString() + " " + map.get(keys[i].toString()));
		}
	}
}
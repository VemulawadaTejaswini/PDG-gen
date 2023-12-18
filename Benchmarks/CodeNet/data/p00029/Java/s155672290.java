mport java.util.*;
import java.util.Map.Entry;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> map;
	public static void main(String[] args) {
		read();
		solve();
	}
	
	static void read() {
		map = new HashMap<String ,Integer>();
		while(sc.hasNext()) {
			String str = sc.next();
			if(map.containsKey(str)) {
				int val = map.get(str);
				map.put(str, val+1);
			} else {
				map.put(str, 1);
			}			
		}
	}

	static void solve() {
		int max_len, max_appear;
		String max_len_str = "", max_appear_str = "";
		max_len = max_appear = 0;
		
		for(Entry<String, Integer> e : map.entrySet()) {
			String key = e.getKey();
			int value = e.getValue();
			int key_len = key.length();
			if(value > max_appear) {
				max_appear = value;
				max_appear_str = key;
			}
			if(key_len > max_len) {
				max_len = key_len;
				max_len_str = key;
			}
		}
		System.out.println(max_appear_str + " " + max_len_str);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int blue_count = sc.nextInt();
		for (int i = 0; i < blue_count; i++) {
			String line = sc.next();
			if (map.containsKey(line)) {
				map.put(line, map.get(line) + 1);
			} else {
				map.put(line, 1);
			}
		}
		
		int red_count = sc.nextInt();
		for (int i = 0; i < red_count; i++) {
			String line = sc.next();
			if (map.containsKey(line)) {
				map.put(line, map.get(line) - 1);
			} else {
				map.put(line, -1);
			}
		}
		
		int maxValue = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > maxValue) {
				maxValue = map.get(key);
			}
		}
		
		System.out.println(maxValue);
	}
}
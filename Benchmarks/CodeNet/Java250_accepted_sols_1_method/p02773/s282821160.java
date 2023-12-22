import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<String, Integer> map = new TreeMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			String z = s.next();
			if (map.containsKey(z)) {
				int v = map.get(z) + 1;
				max = Math.max(max, v);
				map.put(z, v);
			}else {
				map.put(z, 1);
				max = Math.max(max, 1);
			}
		}
		for(String k : map.keySet()) {
			if (map.get(k) == max) {
				System.out.println(k);
			}
		}
	}
	
	
}

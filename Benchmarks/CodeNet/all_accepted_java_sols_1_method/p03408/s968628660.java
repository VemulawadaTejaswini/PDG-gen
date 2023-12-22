import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (!map.containsKey(s)) map.put(s, 0);
			map.put(s, map.get(s) + 1);
		}
		
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String t = sc.next();
			if (!map.containsKey(t)) map.put(t, 0);
			map.put(t, map.get(t) - 1);
		}
		
		int max = 0;
		for (String key : map.keySet())
			max = Math.max(max, map.get(key));
		
		System.out.println(max);
		
		sc.close();
	}
}



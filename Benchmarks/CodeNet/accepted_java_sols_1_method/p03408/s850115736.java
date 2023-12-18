import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new TreeMap<>();
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String s = sc.next();
			
			if (map.containsKey(s)) {
				
				int tmp = map.get(s);
				
				map.put(s, ++tmp);
				
			} else {
				
				map.put(s, 1);
				
			}
			
		}
		
		int m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			
			String t = sc.next();
			
			if (map.containsKey(t)) {
				
				int tmp = map.get(t);
				
				map.put(t, --tmp);
				
			} else {
				
				map.put(t, -1);
				
			}
			
		}
		
		int ans = 0;
		
		for (String key : map.keySet()) {
			
			ans = Math.max(ans, map.get(key));
			
		}
		
		System.out.println(ans);
		
	}

}
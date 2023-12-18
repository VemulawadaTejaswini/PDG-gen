import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> s = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String key = sc.next();
			if(s.containsKey(key)) {
				s.put(key,s.get(key)+1);
			}
			else {
				s.put(key,1);
			}
		}
		int m = sc.nextInt();
		Map<String,Integer> t = new HashMap<>();
		for(int i = 0; i < m; i++) {
			String key = sc.next();
			if(t.containsKey(key)) {
				t.put(key,t.get(key)+1);
			}
			else {
				t.put(key,1);
			}
		}
		int max = 0;
		for(String key:s.keySet()) {
			int count = s.get(key);
			if(t.containsKey(key)) {
				count -= t.get(key);
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}
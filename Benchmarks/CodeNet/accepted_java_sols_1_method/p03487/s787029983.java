import java.util.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		while (sc.hasNextInt()) {
			int key = sc.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		
		
		int ans = 0;
		
		for (int key : map.keySet()) {
			int count = map.get(key);
			if (key < count) {
				ans += count - key;
			} else if (key > count) {
				ans += count;
			}
		}
		System.out.println(ans);
	}
}
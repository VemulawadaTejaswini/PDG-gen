import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.get(a) == null) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
		}
		
		int sum = 0;
		for (int key : map.keySet()) {
			int v = map.get(key);
			sum += v >= key ? v - key : v;
		}
		
		System.out.println(sum);
	}
}

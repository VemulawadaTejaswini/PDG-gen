import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		int count = 0;
		for(int i : map.keySet()) {
			if(i == map.get(i)) {
				continue;
			} else if(i > map.get(i)) {
				count += map.get(i);
			} else {
				count += map.get(i)-i;
			}
		}
		System.out.println(count);
	}
}
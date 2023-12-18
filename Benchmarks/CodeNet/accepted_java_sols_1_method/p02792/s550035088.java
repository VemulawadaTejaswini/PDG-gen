import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for(int i = 1 ; i <= n ; i++) {
				String tmp = String.valueOf(i);
				String start = tmp.substring(0, 1);
				String end = tmp.substring(tmp.length() - 1);
				Integer pair = Integer.valueOf(start + end);
				Integer count = map.getOrDefault(pair, 0);
				map.put(pair, count + 1);
			}
			long ans = 0;
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				String tmp = String.valueOf(entry.getKey());
				String start = tmp.substring(0, 1);
				String end = tmp.substring(tmp.length() - 1);
				Integer pair = Integer.valueOf(end + start);
				ans += entry.getValue() * map.getOrDefault(pair, 0);
			}
			System.out.println(ans);
		}

	}

}

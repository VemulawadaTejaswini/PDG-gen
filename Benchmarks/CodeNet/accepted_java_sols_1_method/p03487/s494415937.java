import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 0;
		Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int key = reader.nextInt();
			int value = 1;
			if (map.containsKey(key)) {
				value = map.get(key) + 1;
			}
			map.put(key, value);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (value < key) {
				ans += value;
			} else {
				ans += value - key;
			}
		}


		System.out.println(ans);
		reader.close();
	}
}




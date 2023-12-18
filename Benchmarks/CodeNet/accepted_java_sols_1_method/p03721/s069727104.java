import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		Long K = reader.nextLong();
		long ans = 0;
		SortedMap<Long, Long> map = new TreeMap<Long, Long>();

		for (int i = 0 ; i < N; i++) {
			long key = reader.nextLong();
			long value = reader.nextLong();
			if (map.containsKey(key)) {
				value += map.get(key);
			}
			map.put(key, value);
		}

		for (Entry<Long, Long> entry : map.entrySet()) {
			K -= entry.getValue();
			if (K <= 0) {
				ans = entry.getKey();
				break;
			}
		}

		System.out.println(ans);
		reader.close();

	}
}




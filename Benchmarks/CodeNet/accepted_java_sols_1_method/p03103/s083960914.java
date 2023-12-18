import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		SortedMap<Long, Integer> AB = new TreeMap<Long, Integer>();
		long ans = 0;

		for (int i = 0; i < N; i++) {
			Long A= reader.nextLong();
			int B = reader.nextInt();
			if (AB.containsKey(A)) {
				AB.put(A, AB.get(A)+B);
			} else {
				AB.put(A, B);
			}
		}

		for (Entry<Long, Integer> entry : AB.entrySet()) {
			if (M <= 0) {
				break;
			} else {
				long key = entry.getKey();
				int value = entry.getValue();
				if (value > M) {
					ans += M * key;
					M = 0;
				} else {
					ans += value * key;
					M -= value;
				}
			}
		}
		System.out.print(ans);
		reader.close();
	}
}


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Long, Long> baMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			long ai = sc.nextLong();
			long bi = sc.nextLong();
			Long tempValue = baMap.get(bi);
			if (tempValue == null) {
				baMap.put(bi, ai);
			} else {
				long updated = tempValue + ai;
				baMap.put(bi, updated);
			}
		}
		sc.close();

		Object[] keys = baMap.keySet().toArray();
		Arrays.sort(keys);
		long tempValue = 0;
		boolean ans = true;
		for (Object key : keys) {
			long tempKey = (long) key;
			tempValue = tempValue + baMap.get(tempKey);
			if (tempValue > tempKey) {
				ans = false;
				break;
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

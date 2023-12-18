import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			changeKey(b, c);
			System.out.println(sumListA());
		}
	}

	public static long sumListA() {
		long ret = 0L;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			ret += entry.getKey() * entry.getValue();
		}
		return ret;
	}

	public static void changeKey(int b, int c) {
		int count = map.get(b);
		map.put(b, 0);
		map.put(c, map.getOrDefault(c, 0) + count);
	}

}

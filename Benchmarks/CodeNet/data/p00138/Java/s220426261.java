
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Double, Integer> map1 = new TreeMap<Double, Integer>();
		Map<Double, Integer> map2 = new TreeMap<Double, Integer>();
		Map<Double, Integer> map3 = new TreeMap<Double, Integer>();
		slove(map1, scanner);
		slove(map2, scanner);
		slove(map3, scanner);
		Map<Double, Integer> map4 = new TreeMap<Double, Integer>();
		out(map1, map4);
		out(map2, map4);
		out(map3, map4);
		out(map4);
	}

	private static void out(Map<Double, Integer> map4) {
		int count = 0;
		for (Entry<Double, Integer> entry : map4.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
			if (count == 1) {
				return;
			}
			count++;
		}

	}

	private static void out(Map<Double, Integer> map1, Map<Double, Integer> map4) {
		int count = 0;
		for (Entry<Double, Integer> entry : map1.entrySet()) {
			if (count < 2) {
				System.out.println(entry.getValue() + " " + entry.getKey());
			} else {
				map4.put(entry.getKey(), entry.getValue());
			}
			count++;
		}
	}

	private static void slove(Map<Double, Integer> map, Scanner scanner) {
		int m = 8;
		while (m-- > 0) {
			int a = scanner.nextInt();
			double b = scanner.nextDouble();
			map.put(b, a);
		}
	}
}
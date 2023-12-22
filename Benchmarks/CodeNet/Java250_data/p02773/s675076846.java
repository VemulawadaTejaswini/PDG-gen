import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String s = scanner.next();
			if (!treeMap.containsKey(s))
				treeMap.put(s, 1);
			else
				treeMap.put(s, treeMap.get(s) + 1);
		}

		int max = 0;
		for (String key : treeMap.keySet()) {
			if (max < treeMap.get(key))
				max = treeMap.get(key);
		}

		for (String key : treeMap.keySet())
			if (treeMap.get(key) == max)
				System.out.println(key);
	}
}
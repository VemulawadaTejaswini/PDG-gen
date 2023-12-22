import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		Map<String, Integer> count = new TreeMap<String, Integer>();
		String base = sc.next();
		count.put(base, 1);
		for (int i = 1; i < N; i++) {
			String temp = sc.next();
			if (!count.containsKey(temp)) {
				count.put(temp, 1);
			} else {
				count.replace(temp, (count.get(temp) + 1));
			}
		}
		int temp = 0;
		for (String k : count.keySet()) {
			temp = Math.max(temp, count.get(k));
		}
		for (String k : count.keySet()) {
			if (temp == count.get(k)) {
				System.out.println(k);
			}
		}
	}
}
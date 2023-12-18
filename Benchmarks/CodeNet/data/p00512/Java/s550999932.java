import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	final static C SINGLE_C = new C();

	static class C implements Comparator<String> {
		private C() {
		};

		@Override
		public int compare(String o1, String o2) {
			int result = o1.length() - o2.length();
			if (result == 0) {
				result = o1.compareTo(o2);
			}
			return result;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] value = new int[n];
		int nextIndex = 0;
		SortedMap<String, Integer> indexMap = new TreeMap<String, Integer>(
				SINGLE_C);
		while (n-- > 0) {
			String name = in.next();
			int index;
			if (!indexMap.containsKey(name)) {
				index = nextIndex;
				indexMap.put(name, Integer.valueOf(nextIndex++));
			} else {
				index = indexMap.get(name).intValue();
			}
			value[index] += in.nextInt();
		}
		for (Entry<String, Integer> e : indexMap.entrySet()) {
			System.out.println(e.getKey() + " "
					+ value[e.getValue().intValue()]);
		}

	}
}
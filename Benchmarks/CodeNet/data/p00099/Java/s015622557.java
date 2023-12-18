import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		in.nextInt();
		int q = in.nextInt();
		SortedMap<Integer, Integer> counter = new TreeMap<Integer, Integer>();
		Integer topNum = null;
		int max = 0;
		for (int i = 0; i < q; i++) {
			final Integer number = Integer.valueOf(in.next());
			int newVal = in.nextInt();
			if (counter.containsKey(number)) {
				newVal += counter.get(number);
			}
			if (newVal == 0) {
				counter.remove(number);
			} else {
				counter.put(number, newVal);
			}
			if (max < newVal || (max == newVal && number.compareTo(topNum) < 0)) {
				max = newVal;
				topNum = number;
			} else if (number.equals(topNum) && max > newVal) {
				max = 0;
				for (Entry<Integer, Integer> entry : counter.entrySet()) {
					if (entry.getValue() > max) {
						max = entry.getValue();
						topNum = entry.getKey();
					}
				}
			}
			System.out.print(topNum);
			System.out.print(' ');
			System.out.print(max);
			if (i < q - 1) {
				System.out.println();
			}
		}
		in.close();
	}
}
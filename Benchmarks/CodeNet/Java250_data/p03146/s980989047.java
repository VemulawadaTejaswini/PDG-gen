import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		in.close();

		Map<Integer, Integer> map = new HashMap<>();
		map.put(s, 0);
		int result = 0;
		int prev = s;
		for (int i = 1; i <= 1000000; ++i) {
			int next = getNext(prev);
			if (map.containsKey(next)) {
				result = i;
				break;
			}
			map.put(next, i);
			prev = next;
		}
		System.out.println(result + 1);

	}

	private static int getNext(int prev) {
		if (prev % 2 == 0) {
			return prev / 2;
		} else {
			return 3 * prev + 1;
		}
	}

}
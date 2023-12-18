import java.util.*;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> array = getStrings(sc, n);
		array.sort(Integer::compareTo);
		Map<Integer, Integer> set = new HashMap();
		int max = array.get(array.size()-1);
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			int m = array.get(i);
			if (!set.containsKey(m)) {
				for (int j = 1; j <= max / m + 1; j++) {
					set.put(m * j, 1);
				}
			} else {
				int temp = set.get(m);
				set.put(m, temp+1);
			}

		}
		for (int i = 0; i < array.size(); i++) {
			if (set.get(array.get(i)) == 1) {
				count++;
			}
		}
		System.out.println(count);
		return;
	}

}



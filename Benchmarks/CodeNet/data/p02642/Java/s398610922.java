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
		if (array.stream().distinct().count() == 1) {
			System.out.println(0);
			return;
		}

		Set<Integer> set = new HashSet<>();
		int max = array.get(array.size()-1);
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = 2; j <= 1000000/array.get(i) + 1; j++) {
				set.add(array.get(i) * j);
			}
			if (i != array.size()-1 && array.get(i) == array.get(i+1)) {
				continue;
			} else if (i != 0 && array.get(i) == array.get(i-1)) {
				continue;
			}
			if (!set.contains(array.get(i))) {
				count++;
			}
		}
		System.out.println(count);
		return;
	}

}

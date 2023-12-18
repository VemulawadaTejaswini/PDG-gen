import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		long sum = 0;
		Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for (int i : line) {
			if (numsMap.containsKey(i)) {
				numsMap.put(i, numsMap.get(i) + 1);
			} else {
				numsMap.put(i, 1);
			}
			sum += i;
		}
		int round = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < round; i++) {
			int[] replace_line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			if (numsMap.containsKey(replace_line[0])) {
				sum = sum - replace_line[0] * numsMap.get(replace_line[0]) + replace_line[1] * numsMap.get(replace_line[0]);
				System.out.println(sum);
				int let = numsMap.get(replace_line[0]);
				if (numsMap.containsKey(replace_line[1])) {
					let += numsMap.get(replace_line[1]);
				}
				numsMap.put(replace_line[1], let);
				numsMap.remove(numsMap.get(replace_line[0]));
			}else {
				System.out.println(sum);
			}

		}

	}

}
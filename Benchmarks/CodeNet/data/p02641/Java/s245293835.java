import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			String[] data1Array = data1.split(" ");

			int seisu = Integer.parseInt(data1Array[0]);
			int length = Integer.parseInt(data1Array[1]);

			if (length == 0) {
				System.out.println(seisu);
				return;
			}

			String[] data2Array = data2.split(" ");
			int[] result = Stream.of(data2Array).mapToInt(Integer::parseInt).toArray();
			List<Integer> list = new ArrayList<Integer>();
			for (int num : result) {
				list.add(num);
			}
			Collections.sort(list);

			int diff = 0;
			int diffNum = 0;
			int max = list.get(list.size() - 1);
			for (int i = 0; i < max; i++) {
				for (int num : list) {
					if (list.contains(i)) {
						continue;
					}

					if (diff == 0 || diff > (Math.abs(i - seisu))) {
						diff = Math.abs(i - seisu);
						diffNum = i;
					}
				}

			}

			System.out.println(diffNum);
		}
	}
}
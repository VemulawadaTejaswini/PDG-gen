import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		String l2 = scan.nextLine();
		scan.close();

		long n = Long.valueOf(l1.split(" ")[0]);
		long k = Long.valueOf(l1.split(" ")[1]);
		String strH = l2;
		List<Long> h = new ArrayList<Long>();
		for (String element : strH.split(" ")) {
			h.add(Long.valueOf(element));
		}

		Collections.sort(h, Collections.reverseOrder());

		Map<Integer, Long> hMap = new HashMap<>();
		int li = 0;
		for (Long element : h) {
			hMap.put(li, element);
			li++;
		}

		for (int i = 0; i < k; i++) {
			hMap.put(i, Long.valueOf(0));
		}

		long result = 0;
		for (Long element : hMap.values()) {
			result += element;
		}

		System.out.println(result);
	}
}

import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfTop3Hills {
	public static void main(String[] args) {

		List<Integer> hillsHightList = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			hillsHightList.add(Integer.valueOf(args[i]));
		}

		Collections.sort(hillsHightList, reverseOrder());

		System.out.println(hillsHightList.get(0));
		System.out.println(hillsHightList.get(1));
		System.out.println(hillsHightList.get(2));

		System.exit(0);
	}
}
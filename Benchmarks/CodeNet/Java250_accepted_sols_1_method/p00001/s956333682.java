import static java.util.Comparator.reverseOrder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> hillsHightList = new ArrayList<>();
		try {
			while (br.ready()) {
				hillsHightList.add(Integer.valueOf(br.readLine()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Collections.sort(hillsHightList, reverseOrder());

		System.out.println(hillsHightList.get(0));
		System.out.println(hillsHightList.get(1));
		System.out.println(hillsHightList.get(2));

		System.exit(0);
	}
}
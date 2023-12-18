import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List<SimpleEntry<Integer, Integer>> list = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				list.add(new SimpleEntry<Integer, Integer>(sc.nextInt(), sc.nextInt()));
			}
			Collections.sort(list, (e1, e2) -> {
				return Integer.compare(e1.getValue(), e2.getValue());
			});
			int current = 0;
			for(SimpleEntry<Integer, Integer> entry : list) {
				if(current + entry.getKey() > entry.getValue()) {
					System.out.println("No");
					System.exit(0);
				} else {
					current += entry.getKey();
				}
			}
			System.out.println("Yes");
		}

	}

}

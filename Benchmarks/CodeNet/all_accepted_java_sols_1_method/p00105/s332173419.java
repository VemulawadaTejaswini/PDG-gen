import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, List<Integer>> book = new TreeMap<String, List<Integer>>();
		while(sc.hasNext()) {
			List<Integer> page = new ArrayList<Integer>();
			String[] text = sc.nextLine().split(" ");
			if(book.containsKey(text[0])) {
				page = book.get(text[0]);
				page.add(Integer.parseInt(text[1]));
				book.put(text[0], page);
			} else {
				page.add(Integer.parseInt(text[1]));
				book.put(text[0], page);
			}
		}

		for(String str : book.keySet()) {
			System.out.println(str);
			List<Integer> page = book.get(str);

			//???????????????????????????
			Collections.sort(page);

			for(int $ = 0; $ < page.size(); $++) {
				if($ == 0) {
					System.out.print(page.get($));
				} else {
					System.out.print(" " + page.get($));
				}
			}
			System.out.println();
		}
	}

}
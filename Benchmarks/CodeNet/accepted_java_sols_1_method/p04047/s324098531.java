import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();
			String lStr = scanner.nextLine();
			String[] lStrs = lStr.split(" ");

			List<Integer> list = new ArrayList<>();
			for (String str : lStrs) {
				list.add(Integer.parseInt(str));
			}

			Collections.sort(list);

			int result = 0;
			for (int i = 0; i < list.size(); i += 2) {
				result += Math.min(list.get(i), list.get(i + 1));
			}

			System.out.println(result);
		}
	}

}

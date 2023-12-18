
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();
			int n = Integer.parseInt(data);

			List<String> list = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String data2 = scanner.nextLine();
				list.add(data2);
			}

			System.out.println(String.format("AC x %d", count(list, "AC")));
			System.out.println(String.format("WA x %d", count(list, "WA")));
			System.out.println(String.format("TLE x %d", count(list, "TLE")));
			System.out.println(String.format("RE x %d", count(list, "RE")));
		}
	}

	private static long count(List<String> list, String str) {
		return list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.equals(str);
			}
		}).count();
	}
}

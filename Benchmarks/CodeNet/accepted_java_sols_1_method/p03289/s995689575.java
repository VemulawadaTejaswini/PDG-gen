import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * AcCepted
	 * @param 4 ≤ |S| ≤ 10

	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			List<String> list = Arrays.asList(s.split(""));
			String ans = "AC";

			if (list.get(0).equals("A")
					&& list.contains("C")
					&& !list.get(1).equals("C")
					&& !list.get(list.size() - 1).equals("C")) {
				int count = 0;
				for (String t : list) {
					if (Character.isUpperCase(t.charAt(0))) {
						count ++;
					}
				}
				if (count > 2) {
					ans = "WA";
				}
			} else {
				ans = "WA";
			}
			System.out.print(ans);
		}
	}
}
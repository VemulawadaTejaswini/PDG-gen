import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		Map<String, Boolean> map = new HashMap<>();
		for (String element : input) {
			if (map.get(element) != null) {
				System.out.println("no");
				System.exit(0);
			}
			map.put(element, true);
		}
		System.out.println("yes");
	}
}

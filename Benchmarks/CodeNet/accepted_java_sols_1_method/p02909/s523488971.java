import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] s = { "Sunny", "Cloudy", "Rainy" };
		Map<String, Integer> map = new HashMap<>();
		map.put("Sunny", 1);
		map.put("Cloudy", 2);
		map.put("Rainy", 0);
		Scanner sc = new Scanner(System.in);
		System.out.println(s[map.get(sc.nextLine())]);
		sc.close();

	}
}

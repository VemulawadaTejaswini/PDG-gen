import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("SUN", 7);
		map.put("MON", 6);
		map.put("TUE", 5);
		map.put("WED", 4);
		map.put("THU", 3);
		map.put("FRI", 2);
		map.put("SAT", 1);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(map.get(input));
	}

}
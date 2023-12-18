import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var map = new HashMap<String, Integer>();
		map.put("AC", 0);
		map.put("WA", 0);
		map.put("TLE", 0);
		map.put("RE", 0);
		for(var i = 0; i < n; i++) {
			var text = sc.next();
			map.put(text, map.get(text) + 1);
		}
		sc.close();

		var sb = new StringBuilder();
		sb.append(String.format("AC x %d\r\n", map.get("AC")));
		sb.append(String.format("WA x %d\r\n", map.get("WA")));
		sb.append(String.format("TLE x %d\r\n", map.get("TLE")));
		sb.append(String.format("RE x %d\r\n", map.get("RE")));
		System.out.println(sb.toString());
	}
}

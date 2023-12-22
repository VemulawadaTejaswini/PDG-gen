import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
        Map<String, String> map = new HashMap<>();
        map.put("Sunny", "Cloudy");
        map.put("Cloudy", "Rainy");
        map.put("Rainy", "Sunny");
		
		System.out.println(map.get(S));
		
		scan.close();
	}

}

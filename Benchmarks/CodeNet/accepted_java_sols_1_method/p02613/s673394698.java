import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		Map<String, Integer> map = new HashMap<>();

		map.put("AC", 0);
		map.put("WA", 0);
		map.put("TLE", 0);
		map.put("RE", 0);

		for(int i = 0; i < n; i++) {

			String a = scanner.nextLine();

			if(a.equals("AC")) {

					map.put("AC", map.get("AC") + 1);

			}else if(a.equals("WA")) {

					map.put("WA", map.get("WA") + 1);

			}else if(a.equals("RE")) {

					map.put("RE", map.get("RE") + 1);

			}else{

				map.put("TLE", map.get("TLE") + 1);

			}
        }
      			System.out.println("AC x " + map.get("AC"));
			System.out.println("WA x " + map.get("WA"));
			System.out.println("TLE x " + map.get("TLE"));
			System.out.println("RE x " + map.get("RE"));

	}
}
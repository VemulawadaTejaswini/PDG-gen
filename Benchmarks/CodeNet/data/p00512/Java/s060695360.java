import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = Integer.parseInt(sc.nextLine());
	static Map<String, Integer> pd = new TreeMap <String, Integer>();
	static int max_length = 0;

	public static void main(String[] args) {

		product();
		dispData();

	}

	private static void dispData() {

		for (int i = 1; i <= max_length; i++) {
			for (String name : pd.keySet()) {
				int num = pd.get(name);
				if (name.length() == i) {
					System.out.printf("%s %d\n", name, num);
				}

			}
		}



	}

	private static void product() {

		for (int i = 0; i < n; i++) {
			String or = sc.nextLine();
			String[] or_d = or.split(" ");
			String name = or_d[0];
			int num = Integer.parseInt(or_d[1]);

				if ( pd.containsKey(name) ) {
					pd.put(name, pd.get(or_d[0]) + num );
				} else {
					pd.put(name, num );
				}

			max_length = Math.max(name.length(), max_length);
		}

	}



}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] stringList = new String[n];
		for (int i = 0; i < n; i++) {
			stringList[i] = scan.next();
		}

		long count = 0;

		Map<String, Long> map = new HashMap<>();
		for (int i = 0; i < n; i++) {

			char[] c = stringList[i].toCharArray();
			Arrays.sort(c);
			String str = String.valueOf(c);
			if (map.containsKey(str)) {
				long num = map.get(str);
				count += num;
				map.put(str, num + 1);
			} else {
				map.put(str, 1l);
			}


		}

		System.out.println(count);
	}
}
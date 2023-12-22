
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans =0;

		Map<String,Long>strmap = new HashMap<String, Long>();

		for (int i = 0; i < N; i++) {
			char[] c = new char[10];
			c = sc.next().toCharArray();
			Arrays.sort(c);
			String let = String.valueOf(c);
			if (strmap.containsKey(let)) {
				strmap.put(let, strmap.get(let) + 1);
			} else {
				strmap.put(let, 1L);
			}
		}

		for (String string : strmap.keySet()) {
			long dub = strmap.get(string);
			ans += dub * (dub-1) / 2;
		}

		System.out.println(ans);

	}
}



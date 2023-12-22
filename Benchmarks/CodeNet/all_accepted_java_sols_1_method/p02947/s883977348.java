
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		long result = 0;

		for (int i = 0; i < N; i++) {
			String[] tmp = S[i].split("");
			Arrays.sort(tmp);
			String s = String.join("", tmp);

			if (map.containsKey(s)) {
				result += map.get(s);
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}

		System.out.println(result);
	}
}

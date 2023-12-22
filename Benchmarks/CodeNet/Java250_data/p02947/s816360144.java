import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String tmp[] = new String[10];
		String tmpStr;
		Map<String, Integer> map = new HashMap<String, Integer>();
		long answer = 0;

		for (int i = 0; i < N; i++) {
			tmpStr = sc.next();
			tmp = tmpStr.split("");
			Arrays.sort(tmp);

			if (map.containsKey(Arrays.toString(tmp))) {
				map.put(Arrays.toString(tmp), (int)map.get(Arrays.toString(tmp)) + 1);
			} else {
				map.put(Arrays.toString(tmp), 1);
			}
		}

		for (String key : map.keySet()) {
			long n = map.get(key);
			answer += (n * (n - 1)) / 2;
		}
		System.out.println(answer);
	}
}

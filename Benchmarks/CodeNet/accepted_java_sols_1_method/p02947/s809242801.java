import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		HashMap<String, Long> map = new HashMap<>();
		int i;
		String key;
		char[] temp;

		for(i = 0; i < n; i++) {
			key = scan.next();
			temp = key.toCharArray();
			Arrays.sort(temp);
			key = new String(temp);

			if(map.containsKey(key)) {
				long sum = map.get(key);
				if(sum == 0)
					map.put(key, new Long(1));
				else
					map.put(key, map.get(key) + 1);
			}else {
				map.put(key, new Long(0));
			}
		}

		long ans = 0;
		for(long a: map.values()) {
			ans += ((1 + a) * a) / 2;
		}
		System.out.println(ans);
	}
}
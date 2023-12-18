import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();

			String[] kuji = new String[N];

			Map<String, Integer> map = new HashMap();
			String key;
			int cnt;
			for(int i = 0; i < N; i++) {
				key = scn.next();
				map.put(key, 0);
			}

			System.out.println(map.size());
		}
	}
}
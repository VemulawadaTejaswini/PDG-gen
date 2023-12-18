
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int N = s[0];
		int M = s[1];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int ans=0;

		for (int i = 0; i < N; i++) {
			int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			for (int j = 1; j < line.length; j++) {
				if (map.containsKey(line[j])) {
					map.put(line[j], map.get(line[j])+1);
				}else {
					map.put(line[j], 1);
				}
			}
		}

		for (Integer ite : map.keySet()) {
			if (map.get(ite) == N) {
				ans++;
			}
		}

		System.out.println(ans);


	}
}



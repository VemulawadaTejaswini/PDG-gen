import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			for (int i = 0; i < N; ++i) {
				char key = sc.next().charAt(0);
				char val = sc.next().charAt(0);
				map.put(key, val);
			}
			int M = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < M; ++i) {
				char c = sc.next().charAt(0);
				if (map.containsKey(c)) {
					sb.append(map.get(c));
				} else {
					sb.append(c);
				}
			}
			System.out.println(sb);
		}
	}
}
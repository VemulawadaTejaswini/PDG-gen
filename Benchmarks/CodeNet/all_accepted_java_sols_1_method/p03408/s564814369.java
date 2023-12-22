import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int ans = 0;

		Map<String, Integer> words = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String target = sc.next();
			if (words.containsKey(target)) {
				words.put(target, words.get(target) + 1);
			}else {
				words.put(target, 1);
			}
		}

		int M= sc.nextInt();
		for (int i = 0; i < M; i++) {
			String target = sc.next();
			if (words.containsKey(target)) {
				words.put(target, words.get(target) - 1);
			}else {
				words.put(target, -1);
			}
		}

		for (String string : words.keySet()) {
			ans = Math.max(ans, words.get(string));
		}

		System.out.println(ans);
	}
}

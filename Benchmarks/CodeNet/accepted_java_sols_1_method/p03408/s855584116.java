
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		HashMap<String, Integer> cards = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			if (cards.containsKey(S)) {
				int value = cards.get(S);
				cards.put(S, ++value);
			} else {
				cards.put(S, 1);
			}
		}

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String S = sc.next();
			if (cards.containsKey(S)) {
				int value = cards.get(S);
				cards.put(S, --value);
			}
		}

		int MAX =0;
		for (String str : cards.keySet()) {
			MAX=Math.max(cards.get(str),MAX);
		}

		System.out.println(MAX);

	}
}

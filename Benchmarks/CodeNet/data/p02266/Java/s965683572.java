import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		sc.close();

		Deque<Integer> s1 = new ArrayDeque<>();
		Deque<int[]> s2 = new ArrayDeque<>();

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '\\':
				s1.push(i);
				break;

			case '_':
				// Do Nothing
				break;

			case '/':
				if (!s1.isEmpty()) {
					int j = s1.pop();
					int menseki = i - j;

					sum += menseki;

					while (!s2.isEmpty() && s2.peek()[0] > j) {
						menseki += s2.pop()[1];
					}

					int[] val = {j, menseki};
					s2.push(val);
				}
				break;
			default:
				break;
			}
		}

		System.out.println(sum);
		System.out.print(s2.size());
		while (!s2.isEmpty()) {
			System.out.print(" " + s2.pollLast()[1]);
		}
		System.out.println();
	}
}
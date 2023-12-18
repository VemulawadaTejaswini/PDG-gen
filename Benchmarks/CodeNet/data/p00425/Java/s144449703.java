
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		Map<Character, int[]> memo = new HashMap<Character, int[]>();
		memo.put('N', new int[] { 1, 5, 2, 3, 0, 4 });
		memo.put('E', new int[] { 3, 1, 0, 5, 4, 2 });
		memo.put('W', new int[] { 2, 1, 5, 0, 4, 3 });
		memo.put('S', new int[] { 4, 0, 2, 3, 5, 1 });
		memo.put('R', new int[] { 0, 2, 4, 1, 3, 5 });
		memo.put('L', new int[] { 0, 3, 1, 4, 2, 5 });
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] dice = new int[6];
			for (int i = 0; i < 6; i++)
				dice[i] = i + 1;
			int ans = 1;
			for (int i = 0; i < n; i++) {
				char c = scanner.next().charAt(0);
				int[] tmp = new int[6];
				for (int j = 0; j < 6; j++) {
					tmp[j] = dice[memo.get(c)[j]];
				}
				dice = tmp;
				ans += dice[0];
			}
			System.out.println(ans);
		}
	}
}
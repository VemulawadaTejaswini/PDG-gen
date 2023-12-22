import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();

		int[] start = new int[26];
		int[] goal = new int[26];
		Arrays.fill(start, -1);
		Arrays.fill(goal, -1);

		for (int i = 0; i < S.length; i++) {
			int a = S[i] - 'a';
			int b = T[i] - 'a';

			if (start[a] != -1 || goal[b] != -1) {
				if (start[a] != b || goal[b] != a) {
					System.out.println("No");
					return;
				}
			} else {
				start[a] = b;
				goal[b] = a;
			}
		}

		System.out.println("Yes");
	}
}

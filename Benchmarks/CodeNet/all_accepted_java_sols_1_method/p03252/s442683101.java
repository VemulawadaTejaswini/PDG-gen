import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int[] start = new int[26];
		int[] goal = new int[26];
		Arrays.fill(start, -1);
		Arrays.fill(goal, -1);
		for (int i = 0; i < s.length; i++) {
			int a = s[i] - 'a';
			int b = t[i] - 'a';
			if (start[a] != -1 || goal[b] != -1) {
				if (start[a] != b || goal[b] != a) {
					System.out.println("No");
					return;
				}
			}
			start[a] = b;
			goal[b] = a;

			//			for (int j = 0; j < 26; j++) {
			//				System.out.print((char) (start[j] + 'a') + " ");
			//			}
			//			System.out.println();
			//			for (int j = 0; j < 26; j++) {
			//				System.out.print((char) (goal[j] + 'a') + " ");
			//			}
			//			System.out.println();
			//			System.out.println();
		}
		System.out.println("Yes");
	}
}

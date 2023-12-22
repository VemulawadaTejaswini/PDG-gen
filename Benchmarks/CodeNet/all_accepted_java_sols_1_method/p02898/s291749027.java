import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		int[] member = new int[x];
		for (int i = 0; i < member.length; i++) {
			member[i] = scanner.nextInt();
		}

		scanner.close();

		int ans = 0;
		for (int i : member) {
			if (i >= y) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
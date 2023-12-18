import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] l = new int[n];

		for (int i = 0; i < m; i++) {
			l[scanner.nextInt() - 1]++;
			l[scanner.nextInt() - 1]++;
		}

		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}

	}
}
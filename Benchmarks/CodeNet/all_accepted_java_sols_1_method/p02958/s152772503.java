import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N; i++)
			p[i] = scanner.nextInt();
		scanner.close();

		int cnt = 0;
		for (int i = 0; i < N; i++)
			if (p[i] != i + 1)
				cnt++;

		switch (cnt) {
		case 0:
		case 2:
			System.out.println("YES");
			break;
		default:
			System.out.println("NO");
			break;
		}
	}
}
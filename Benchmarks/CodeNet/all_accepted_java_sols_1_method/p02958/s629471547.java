import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N + 1];
		int miss = 0;

		for (int i = 1; i <= N; i++) {
			p[i] = sc.nextInt();

			if (p[i] != i) miss++;
		}

		if (miss == 2 || miss == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

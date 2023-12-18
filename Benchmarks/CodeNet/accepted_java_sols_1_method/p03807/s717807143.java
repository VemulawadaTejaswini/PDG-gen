import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int odd = 0;

		for (int i = 0; i < N; i++) {
			if (scan.nextInt() % 2 == 1) odd++;
		}

		System.out.println(odd % 2 == 0 ? "YES" : "NO");
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1;; ++i) {
			int x = scanner.nextInt();
			if (x == 0)
				break;
			System.out.printf("Case %d: %d\n", i, x);
		}
		scanner.close();
	}

}

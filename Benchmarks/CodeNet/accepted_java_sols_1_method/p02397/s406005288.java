import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {

			int i = sc.nextInt();
			int j = sc.nextInt();
			if (i == 0 && j == 0) {
				break;
			}
			System.out.printf("%d %d\n", Math.min(i, j), Math.max(i, j));
		}
		sc.close();
	}
}
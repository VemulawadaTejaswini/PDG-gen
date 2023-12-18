import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 26; j++) {
				if (N == 7 * i + 4 * j) {
					System.out.println("Yes");
					return;
				}

			}
		}
		System.out.println("No");
	}

}
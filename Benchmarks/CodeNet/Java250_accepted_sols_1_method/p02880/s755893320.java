import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int result = i * j;
				if (N == result) {
					System.out.println("Yes");
					return;
				}

			}
		}
		System.out.println("No");
	}

}

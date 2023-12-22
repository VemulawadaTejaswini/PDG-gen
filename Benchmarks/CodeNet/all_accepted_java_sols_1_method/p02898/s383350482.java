import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;

		for (int i = 0; i < a; i++) {
			if (sc.nextInt() >= b) {
				count++;
			}
		}

		System.out.println(count);

	}
}
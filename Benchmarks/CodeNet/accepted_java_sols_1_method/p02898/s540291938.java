import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mem = sc.nextInt();
		int minHeight = sc.nextInt();
		int count = 0;

		for (int i = 0; i < mem; i++) {
			if (minHeight <= sc.nextInt()) {
				count++;
			}
		}

		System.out.println(count);

	}
}

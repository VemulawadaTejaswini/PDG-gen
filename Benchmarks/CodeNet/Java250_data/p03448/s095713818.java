import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int X = in.nextInt();

		int count = 0;

		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				int c = (X - i * 500 - j * 100) / 50;
				if (c >= 0 && c <= C) {
					count++;
				}

			}
		}
		System.out.println(count);
	}
}

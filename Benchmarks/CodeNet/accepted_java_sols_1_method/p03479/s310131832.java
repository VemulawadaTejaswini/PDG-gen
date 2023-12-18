import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long X = s.nextLong();
		long Y = s.nextLong();
		int count = 1;

		while (X < Y) {
			X = X * 2;
			if (X <= Y) {
				count++;
			} else {
				break;
			}
		}

		System.out.println(count);

	}
}

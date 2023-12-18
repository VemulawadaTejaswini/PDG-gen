import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long row = stdin.nextLong() - 2;
		long column = stdin.nextLong() - 2;

		System.out.println(Math.abs(row * column));
	}

}

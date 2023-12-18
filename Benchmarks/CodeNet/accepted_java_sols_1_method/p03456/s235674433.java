import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int input = Integer.parseInt(stdin.next() + stdin.next());
		int rePow = (int)Math.pow((int)Math.sqrt(input), 2);
		System.out.println((input == rePow) ? "Yes" : "No");
	}
}

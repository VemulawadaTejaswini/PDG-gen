import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int d = stdin.nextInt();

		int min = Math.min(a, b) + Math.min(c, d);
		System.out.println(min);
	}

}

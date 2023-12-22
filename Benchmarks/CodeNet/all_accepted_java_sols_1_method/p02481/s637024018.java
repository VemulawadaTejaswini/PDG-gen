import java.util.Scanner;
class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.print(x * y);
                System.out.print(" ");
		System.out.println(2 * (x + y));
	}
}
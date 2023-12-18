import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		try {
			Scanner in = new Scanner(System.in);
			a = Integer.parseInt(in.next());
			b = Integer.parseInt(in.next());
		} catch (NumberFormatException e) {
			System.err.println("不正な入力");
			System.exit(1);
		}
		System.out.print(a * b + " ");
		System.out.println((a + b) * 2);
	}
}
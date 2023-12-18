import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		try {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("不正な入力");
			System.exit(1);
		}
		System.out.println(a * b + " " + (a + b) * 2);
	}
}
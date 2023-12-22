import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i = 0;
		try {
			i = Integer.parseInt(new Scanner(System.in).next());
		} catch (NumberFormatException e) {
			System.err.println("不正な入力");
			System.exit(1);
		}
		System.out.println((int)Math.pow(i, 3));
	}
}
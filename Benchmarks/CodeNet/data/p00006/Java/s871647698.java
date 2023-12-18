import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] target = scanner.nextLine().split("");
		for (int i = target.length - 1; i > 0; i--) {
			System.out.print(target[i]);
		}
		System.out.println(target[0]);
	}
}
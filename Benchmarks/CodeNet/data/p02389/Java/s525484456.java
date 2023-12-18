import java.util.Scanner;

public class Main {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int a = Integer.parseInt(k[0]);
		int b = Integer.parseInt(k[1]);

		System.out.print(a * b + " " + 2 * a + 2 * b);
	}
}
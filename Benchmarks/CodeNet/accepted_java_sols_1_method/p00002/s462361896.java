import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		int a = 0, b = 0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(String.valueOf(a + b).length());
		}
	}
}
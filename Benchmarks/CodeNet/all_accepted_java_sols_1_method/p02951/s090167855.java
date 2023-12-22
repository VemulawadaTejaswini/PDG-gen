import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int d = b + c - a;
		if (d < 0) {
			d = 0;
		}
		System.out.println(d);

	}

}

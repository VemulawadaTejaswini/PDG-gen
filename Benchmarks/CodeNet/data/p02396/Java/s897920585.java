import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {

			i = i + 1;
			int x = scan.nextInt();
			if (x == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + x);
			}
		}
	}

}
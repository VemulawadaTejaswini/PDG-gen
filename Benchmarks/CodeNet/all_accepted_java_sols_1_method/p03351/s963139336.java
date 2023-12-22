import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sn = new Scanner(System.in)) {
			int a = sn.nextInt();
			int b = sn.nextInt();
			int c = sn.nextInt();
			int d = sn.nextInt();

			if ((Math.abs(b - a) <= d && Math.abs(c - b) <= d) || Math.abs(c - a) <= d) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}

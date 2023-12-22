import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		for(;;) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if(x == 0 && y == 0)
				break;

			System.out.println(String.format(x < y ? "%1$d %2$d" : "%2$d %1$d", x, y));
		}
	}
}


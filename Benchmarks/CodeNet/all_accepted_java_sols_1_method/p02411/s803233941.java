
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (a == -1 && b == -1 && c == -1)
				break;
			if (a == -1 || b == -1)
				System.out.println("F");
			else if (a + b >= 80)
				System.out.println("A");
			else if (a + b >= 65)
				System.out.println("B");
			else if (a + b >= 50)
				System.out.println("C");
			else if (a + b >= 30)
				if (c >= 50)
					System.out.println("C");
				else
					System.out.println("D");
			else
				System.out.println("F");
		}

	}
}
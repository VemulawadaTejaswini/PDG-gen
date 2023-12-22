import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int r = s.nextInt();
			int d = s.nextInt();
			int x2000 = s.nextInt();

			int x = x2000;
			for (int i = 1; i <= 10; i++) {
				x = r * x - d;
				System.out.println(x);
			}
		}
	}

}

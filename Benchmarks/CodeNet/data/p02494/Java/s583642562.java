import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner in = new Scanner(System.in);

		for (;;) {
			try {
				a = in.nextInt();
				b = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			if (a == 0 && b == 0)
				System.exit(0);

			for (int i = 0; i < a; ++i) {
				for (int j = 0; j < b; ++j)
					System.out.print("#");
				System.out.println();
			}
		}
	}
}

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			StringBuilder[] builders = new StringBuilder[10];
			for (int i = 0; i < 10; i++)
				builders[i] = new StringBuilder();
			while (n-- > 0) {
				int a = scanner.nextInt();
				builders[a].append('*');
			}
			for (StringBuilder builder : builders)
				if (builder.length() == 0)
					System.out.println('-');
				else
					System.out.println(builder);
		}
	}
}
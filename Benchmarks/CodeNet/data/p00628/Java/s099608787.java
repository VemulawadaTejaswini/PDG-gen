
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.nextLine();
			if (s.equals("END OF INPUT"))
				break;
			String[] ss = s.split(" ");
			for (int i = 0; i < ss.length; i++)
				System.out.print(ss[i].length());
			System.out.println();
		}
	}
}
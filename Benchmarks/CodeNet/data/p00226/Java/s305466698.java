
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			char[] a = scanner.next().toCharArray();
			char[] b = scanner.next().toCharArray();
			if (String.valueOf(a).equals("0"))
				break;
			int h = 0;
			for (int i = 0; i < 4; i++)
				if (a[i] == b[i])
					h++;
			int br = 0;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					if (i == j)
						continue;
					else if (a[i] == b[j])
						br++;
			System.out.println(h + " " + br);
		}
	}
}
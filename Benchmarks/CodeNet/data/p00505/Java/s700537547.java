
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		while (scanner.hasNext()) {
			for (int i = 0; i < 3; i++)
				num[i] = scanner.nextInt();
			Arrays.sort(num);
			if (num[0] + num[1] <= num[2]) {
				System.out.printf("%d %d %d %d\n", a, b, c, d);
				return;
			}
			a++;
			int na = num[0] * num[0];
			int nb = num[1] * num[1];
			int nc = num[2] * num[2];
			if (na + nb == nc)
				b++;
			else if (na + nb > nc)
				c++;
			else
				d++;
		}
	}
}
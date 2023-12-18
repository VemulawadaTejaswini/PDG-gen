
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			double n = scanner.nextDouble();
			if (n < 0)
				break;
			int val = (int) n;
			if (Integer.toBinaryString(val).length() > 8)
				System.out.println("NA");
			else {
				double syousu = (n - val) * 16;
				int syousuInt = (int) syousu;
				if (syousu != syousuInt)
					System.out.println("NA");
				else {
					int a = Integer.parseInt(Integer.toBinaryString(val));
					int b = Integer.parseInt(Integer.toBinaryString(syousuInt));
					System.out.printf("%08d.%04d\n", a, b);
				}
			}

		}
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			if (n % 1111 == 0)
				System.out.println("NA");
			else {
				int count = 0;
				while (true) {
					if (n == 6174)
						break;
					n = slove(n);
					count++;
				}
				System.out.println(count);
			}

		}
	}

	private int slove(int n) {
		char[] c = String.valueOf(n).toCharArray();
		Arrays.sort(c);
		StringBuilder builder = new StringBuilder(String.valueOf(c));
		int min= Integer.valueOf(builder.toString());
		int max = Integer.valueOf(builder.reverse().toString());
		return max - min;
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());

		int c = 'a';

		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			long remainder = (n - 1) % 26;
			sb.append((char) (c + remainder));

			n = (n - remainder + 1) / 26;
		}

		System.out.println(sb.reverse());
	}

}

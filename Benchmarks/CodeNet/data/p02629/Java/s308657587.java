import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());

		int c = 'a' - 1;

		StringBuilder sb = new StringBuilder();
		while (true) {
			long remainder = n % 26;
			sb.append((char) (c + remainder));
			n = (n - remainder) / 26;
			if (n == 0)
				break;
		}
		
		System.out.println(sb.reverse());
	}

}
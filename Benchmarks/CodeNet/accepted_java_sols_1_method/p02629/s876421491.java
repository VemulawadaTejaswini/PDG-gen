import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextLong();
		sc.close();

		var sb = new StringBuilder();
		while (n > 0) {
			sb.append((char) ('a' + ((n - 1) % 26)));
			n = (n - 1) / 26;
		}
		sb.reverse();
		System.out.println(sb.toString());
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			String line = stdin.next();
			sb.append(line.charAt(i));
		}

		System.out.print(sb.toString());
	}

}

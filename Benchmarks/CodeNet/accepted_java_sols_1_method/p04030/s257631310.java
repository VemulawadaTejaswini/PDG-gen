import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		StringBuilder sb = new StringBuilder();
		for (char si : s.toCharArray()) {
			switch (si) {
			case 'B':
				if (sb.length() != 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
				break;
			default:
				sb.append(si);
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
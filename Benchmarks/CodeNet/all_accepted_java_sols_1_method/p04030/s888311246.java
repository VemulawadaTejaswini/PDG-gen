import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder(s);

			int index = sb.indexOf("B");
			while (true) {
				if (index == -1) {
					break;
				}

				sb = sb.deleteCharAt(index);
				if (index != 0) {
					sb = sb.deleteCharAt(index - 1);
				}

				index = sb.indexOf("B");
			}

			System.out.println(sb.toString());

		} finally {
			sc.close();
		}
	}
}
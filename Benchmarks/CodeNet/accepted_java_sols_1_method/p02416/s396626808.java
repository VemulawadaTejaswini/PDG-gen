import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();

			if (line.equals("0")) {
				break;
			}
			int result = 0;
			for (int i = 0; i < line.length(); i++) {
				String str = line.substring(i, i + 1);
				int n = Integer.parseInt(str);
				result += n;
			}
			System.out.println(result);

		}
	}

}
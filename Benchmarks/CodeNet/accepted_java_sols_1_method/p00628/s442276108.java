import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String string = scanner.nextLine();
			if (string.equals("END OF INPUT")) {
				break;
			}
			String[] a = string.split(" ");
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < a.length; i++) {
				stringBuilder.append(a[i].length());
			}
			System.out.println(stringBuilder);
		}
		scanner.close();
	}

}


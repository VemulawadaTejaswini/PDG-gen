import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 0;
		while (n < 1) {
			String line = sc.nextLine();
			i++;
			int x = Integer.parseInt(line);
			if (x == 0) {
				break;
			}
			System.out.println("case" + i + ": " + x);

		}

	}
}
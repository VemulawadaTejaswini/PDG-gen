import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while (i < 10001) {
			String line = sc.nextLine();
			int x = Integer.parseInt(line);
			if (x == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + x);
			i++;
		}

	}

}
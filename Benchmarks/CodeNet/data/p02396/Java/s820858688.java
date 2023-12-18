import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 10000; i++) {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + n);
		}

	}


}


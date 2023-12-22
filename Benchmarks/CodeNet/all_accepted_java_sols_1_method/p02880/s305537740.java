import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		boolean isMatch = false;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (line == i*j) {
					isMatch = true;
				}
			}
		}
		sc.close();
		if (isMatch) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		boolean result = false;
		for (int i = 0; i <= 100; i = i + 7) {
			for (int j = 0; i + j <= 100; j = j + 4) {
				if (i + j == n) {
					result = true;
					break;
				}
			}
			if (result) {
				break;
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}
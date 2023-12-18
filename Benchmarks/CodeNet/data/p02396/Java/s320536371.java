import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			int x = sc.nextInt();
			if (x != 0) {
				System.out.println("Case " + i + ": " + x);
				i++;
			} else {
				break;
			}

		} while (i == 0);

	}

}

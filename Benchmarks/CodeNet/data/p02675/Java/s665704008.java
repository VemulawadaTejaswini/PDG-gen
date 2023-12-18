import java.util.Scanner;

public class Main {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num = Integer.valueOf(line);
		int one = num % 10;
		if (one == 3) {
			System.out.println("bon");
		} else if (one == 0 || one == 1 || one == 6 || one == 8) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}

	}
}
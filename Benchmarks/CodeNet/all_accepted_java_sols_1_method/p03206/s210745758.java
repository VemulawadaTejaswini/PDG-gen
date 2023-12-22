import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		if (s == 25) {
			System.out.println("Christmas");
		} else if (s == 24) {
			System.out.println("Christmas Eve");
		} else if (s == 23) {
			System.out.println("Christmas Eve Eve");
		} else if (s == 22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}

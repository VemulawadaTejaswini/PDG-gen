import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		int l = s / 100;
		int r = s % 100;
		if (l >= 1 && l <= 12) {
			if (r >= 1 && r <= 12) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if (r >= 1 && r <= 12) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean yellow = false;
		int n = scan.nextInt();
		String s = scan.nextLine();
		s = scan.nextLine();
		if (s.contains("Y")) {
			yellow = true;
		}
		if (yellow) {
			System.out.println("Four");
			return;
		} else {
			System.out.println("Three");
			return;
		}
	}
}

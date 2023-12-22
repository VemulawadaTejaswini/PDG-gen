import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String b = sc.next();

		if (b.equals("A")) {
			System.out.print("T");
		} else if (b.equals("T")) {
			System.out.print("A");
		} else if (b.equals("C")) {
			System.out.print("G");
		} else {
			System.out.print("C");
		}
	}
}
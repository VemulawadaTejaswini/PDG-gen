
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if ("A".equals(input)) {
			System.out.println("T");
		} else if ("G".equals(input)) {
			System.out.println("C");
		} else if ("T".equals(input)) {
			System.out.println("A");
		} else {
			System.out.println("G");
		}
	}
}
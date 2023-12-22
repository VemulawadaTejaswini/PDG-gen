import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		if ("A".equals(b)) {
			System.out.println("T");
		} else if ("C".equals(b)) {
			System.out.println("G");
		} else if ("G".equals(b)) {
			System.out.println("C");
		} else {
			System.out.println("A");
		}
	}
}
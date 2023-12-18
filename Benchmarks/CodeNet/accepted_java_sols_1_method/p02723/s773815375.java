import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.next();

		if (test.charAt(2) == test.charAt(3) && test.charAt(4) == test.charAt(5)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.next();

		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.print(str.charAt(i));
		}

	}
}
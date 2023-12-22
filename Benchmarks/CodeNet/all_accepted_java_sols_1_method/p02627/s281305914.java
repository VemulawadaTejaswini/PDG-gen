import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		if (Pattern.compile("[A-Z]*").matcher(in).matches()) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}

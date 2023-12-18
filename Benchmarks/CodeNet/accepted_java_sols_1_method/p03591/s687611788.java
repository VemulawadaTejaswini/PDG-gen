import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		if (input.length() < 4) {
			System.out.println("No");
			return;
		}

		System.out.println(input.substring(0,4).equals("YAKI")? "Yes" : "No");
	}
}

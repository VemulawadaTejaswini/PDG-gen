import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.valueOf(sc.nextLine());
		String input = sc.nextLine();
		if (input.length() > k) {
			System.out.println(input.substring(0, k) + "...");
		} else {
			System.out.println(input);
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		if (input.length() <= N) {
			System.out.println(input);
		} else {
			System.out.println(input.substring(0, N) + "...");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int length = input.length();

		int total = 0;
		for (int i =  0; i<length; i++) {
			int k = Integer.parseInt(String.valueOf(input.charAt(i)));
			total = total + k;
		}
		String result = Integer.parseInt(input) % total == 0 ? "Yes" : "No";
		System.out.println(result);

	}
}

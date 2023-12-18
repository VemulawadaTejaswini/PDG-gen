import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = (sum + s.charAt(i) - '0') % 9;
		}
		System.out.println(sum == 0 ? "Yes" : "No");
		in.close();
	}
}

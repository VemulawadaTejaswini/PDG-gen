import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		c = sc.nextLine();

		for (int i = 0; i < c.length(); i++) {
			char t = c.charAt(i);
			if ('A' <= t && t <= 'Z') {
				t += 32;
			} else if ('a' <= t && t <= 'z') {
				t -= 32;
			}
			System.out.print(t);
		}
		System.out.println();
	}
}

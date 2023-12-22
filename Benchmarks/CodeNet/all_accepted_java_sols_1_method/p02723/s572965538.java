import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println((s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) ? "Yes" : "No");
		}
	}
}
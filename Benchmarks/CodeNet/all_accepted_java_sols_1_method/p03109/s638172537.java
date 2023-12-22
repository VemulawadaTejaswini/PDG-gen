import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String s[] = S.split("/");

		if (s[1].equals("04") || s[1].equals("01") || s[1].equals("02") || s[1].equals("03")) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
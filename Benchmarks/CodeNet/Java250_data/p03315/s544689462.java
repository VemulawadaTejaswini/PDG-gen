import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.next();
		str = str.replaceAll("[^-,+]", "");
		int plus = str.replaceAll("[-]", "").length();
		int minus = str.length() - plus;

		System.out.println(plus - minus);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String b = "ABC";
		String r = "ARC";
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		if (b.equals(in)) {
			System.out.println(r);
		} else {
			System.out.println(b);
		}
	}
}

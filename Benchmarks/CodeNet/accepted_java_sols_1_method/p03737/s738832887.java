import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a = s.next();
		String b = s.next();
		String c = s.next();

		String ans1 = a.toUpperCase();
		String ans2 = b.toUpperCase();
		String ans3 = c.toUpperCase();
		System.out.print(ans1.charAt(0));
		System.out.print(ans2.charAt(0));
		System.out.print(ans3.charAt(0));

	}

}
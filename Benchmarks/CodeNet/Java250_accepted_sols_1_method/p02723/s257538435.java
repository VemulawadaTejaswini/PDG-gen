import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		char i2 = S.charAt(2);
		char i3 = S.charAt(3);
		char i4 = S.charAt(4);
		char i5 = S.charAt(5);

		if (i2 == i3 && i4 == i5) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}

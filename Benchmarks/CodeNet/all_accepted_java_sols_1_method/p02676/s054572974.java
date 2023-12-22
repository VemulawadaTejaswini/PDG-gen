import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String z = sc.next();
		if (z.length() > k) {
			System.out.println(z.substring(0, k) + "...");
		}else {
			System.out.println(z);
		}
	}
}

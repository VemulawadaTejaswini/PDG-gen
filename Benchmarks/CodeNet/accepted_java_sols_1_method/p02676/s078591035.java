import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		sc.close();

		if (k >= s.length()) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0, k) + "...");
		}
	}
}
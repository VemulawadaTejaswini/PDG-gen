import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int l = String.valueOf(a).length();

		String r = String.valueOf(a).substring(l - 1);
		int p = Integer.parseInt(r);

		if (p == 3) {
			System.out.println("bon");
		} else if (p == 0 || p == 1 || p == 6 || p == 8) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}
	}
}

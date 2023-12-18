import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c1 = sc.nextLine();
		String c2 = sc.nextLine();
		String c3 = sc.nextLine();

		System.out.println(c1.substring(0, 1) + c2.substring(1, 2) + c3.substring(2, 3));

		sc.close();
	}
}